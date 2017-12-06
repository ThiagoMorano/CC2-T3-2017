grammar SQLoop;

/* ITENS LÉXICOS */

/* ######## PALAVRAS CHAVE (NÃO PODE USAR COMO NOME DE VARIÁVEL OU FUNÇÃO) ######## */
PalavrasChave : 'Table' | 'Relationships' | 'aincrement' | 'integer' |'string' | 'unsigned' | 'genTimestamps' | 'belongsTo' | 'hasMany' | 'hasOne' | 'getTimestamps' | 'where' | 'date';


/* ######## DECLARAÇÃO DE FRAGMENTS PARA SIMPLIFICAR A GRAMÁTICA. NUNCA É CONTADO COMO TOKEN. ######## */
fragment LETRA_MINUSCULA : ('a'..'z');
fragment LETRA_MAIUSCULA : ('A'..'Z');
fragment NUMERO : '0' .. '9';


/* ######## IDENT (SEQUENCIA DE LETRAS, DÍGITOS E UNDERSCORE ('_') COMEÇANDO POR LETRA OU UNDERSCORE.) ######## */
IDENT : ('_'| '@' | LETRA_MINUSCULA | LETRA_MAIUSCULA) (LETRA_MAIUSCULA | LETRA_MINUSCULA | INTEIRO | '_' | '@' | '$')*;


/* ######## DEFINIÇÕES NUMÉRICAS ######## */
INTEIRO : NUMERO+ ;


/* ######## CADEIA DE CARACTERES: USO COM ASPAS SIMPLES (') - É o valor atribuído a variáveis strings. Não permitido uso de \n . ######## */
CADEIA : '"' (~('"' | '\n') )* '"';

/* ######## FORMATACAO DE DATAS ######## */
//DATA : (NUMERO NUMERO) '-' (NUMERO NUMERO) '-' (NUMERO NUMERO NUMERO NUMERO);


/*#### SIMBOLOS IGNORADOS ###### */
IGNORADOS:
    (' ' |'\t' | '\r' | '\n') {
        skip();
    }
;

/* ######## COMENTÁRIOS ######## */
COMENTARIO :  '#' ~('#')* '#' {skip();};

/* ######## ANALISADOR SINTÁTICO - REGRAS ######## */

programa : ddl (dml)? EOF;

ddl : '@DDL' declaracoes '@endDDL';

declaracoes : 'Table' IDENT '{' definicoes (relacoes)?  '}' (declaracoes)?;

definicoes : tabela '->' def_metodos ';' (defi  nicoes)?;

def_metodos returns [boolean u_inteiro, int tipo_def]
	: 'aincrement' '(' var_int ')' {$tipo_def = 0;}
	| 'integer' '(' var_int ')' {$tipo_def = 1;} ('->' 'unsigned' '()' {$u_inteiro = true; $tipo_def = 2;})?
	| 'string' '(' var_str ')' {$tipo_def = 3;}
	| 'date' '(' var_date ')' {$tipo_def = 4;}
	| 'genTimestamps''()' {$tipo_def = 5;};

relacoes : 'Relationships' '{' rel_def '}';

rel_def : tabela '->' rel_metodos ';' (rel_def)? ;

rel_metodos returns [int tipo_rel]
	: 'belongsTo' '(' var_str ')' {$tipo_rel = 0;}
	| 'hasMany' '(' var_str ')' {$tipo_rel = 1;}
	| 'hasOne' '(' var_str ')' {$tipo_rel = 2;};


dml : '@DML' comandos '@endDML';

comandos : cmd (comandos)? ;

cmd : tabela '=' insercao ';' | tabela consulta ';' ;

insercao : '[' valores ']' ;

valores : valor (mais_valor)?;

valor : valor_str | valor_int | valor_date;

valor_str : CADEIA ;

valor_int : INTEIRO;

valor_date : INTEIRO '-' INTEIRO '-' INTEIRO;

mais_valor : (',' valor)*;

consulta : '->' variavel '->' 'where'( var_int '(' valor_int ')' | var_str '(' valor_str ')' );

tabela returns [int linha] : '$' IDENT {$linha = $IDENT.line;};

variavel : var_int | var_str;

var_int returns [int linha, String nome] : '\'' IDENT '\'' {$linha = $IDENT.line;};

var_str returns [int linha] : '\'' IDENT '\'' {$linha = $IDENT.line;};

var_date returns [int linha] : '\'' IDENT '\'' {$linha = $IDENT.line;};


/*#### TRATAMENTO DE ERROS DE SÍMBOLOS NÃO IDENTIFICADOS ####*/
ERROR: . { throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado\n"); };

COMENTARIO_ERRO : '#' ~('\r'|'\n'|'#')* '\n' { throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado\n"); };