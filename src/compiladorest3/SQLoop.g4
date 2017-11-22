grammar SQLoop;

/* ITENS LÉXICOS */

/* ######## PALAVRAS CHAVE (NÃO PODE USAR COMO NOME DE VARIÁVEL OU FUNÇÃO) ######## */
PalavrasChave : 'Table' | 'Relationships' | 'aincrement' | 'integer' |'string' | 'unsigned' | 'genTimestamps' | 'belongsTo' | 'getTimestamps' | 'where' | 'hasMany' | 'date';


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

definicoes : tabela '->' def_metodos ';' (definicoes)?;

def_metodos : 'aincrement' '(' var_int ')' | 'integer' '(' var_int ')' ('->' 'unsigned' '()' )? |
		  'string' '(' var_str ')' | 'date' '(' var_date ')' | 'genTimestamps''()';

relacoes : 'Relationships' '{' rel_def '}';

rel_def : tabela '->' rel_metodos ';' (rel_def)? ;

rel_metodos : 'belongsTo' '(' var_str ')';


dml : '@DML' comandos '@endDML';

comandos : cmd (comandos)? ;

cmd : tabela '=' insercao ';' | tabela consulta ';' ;

insercao : '[' valores ']' ;

valores : valor (mais_valor)?;

valor : valor_str | valor_int | valor_date;

valor_str : CADEIA;

valor_int : '\'' INTEIRO '\'';

valor_date : '\'' INTEIRO '-' INTEIRO '-' INTEIRO '\'';

mais_valor : (',' valor)*;

consulta : '->' variavel '->' 'where'( var_int '(' valor_int ')' | var_str '(' valor_str ')' );

tabela : '$' IDENT;

variavel : var_int | var_str;

var_int : '\'' IDENT '\'';

var_str : '\'' IDENT '\'';

var_date : '\'' IDENT '\'';


/*#### TRATAMENTO DE ERROS DE SÍMBOLOS NÃO IDENTIFICADOS ####*/
ERROR: . { throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado\n"); };

COMENTARIO_ERRO : '#' ~('\r'|'\n'|'#')* '\n' { throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado\n"); };