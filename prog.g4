grammar prog;

start returns [double value]
    :   'begin'
		(statements)*
		'end'
    ;
	
statements
	:(print | varCheck | let | input | start | if_else | while_loop | for_stat | functionCall | function | return_stat)
	;
	
return_stat
	: 'return ' simpleexpression (functionCall)?
	;
	
if_else 
	 : ( 'if' condition ifstart=start )('else' elsestart=start)? 
	 ;
	
condition 
        : expression 
		;
		
while_loop 
		: 'while' condition whilestart=start 
		;

for_stat
       : 'for ' v=VAR '=' num1=NUMBER ' to ' condition ' step ' num2=NUMBER forstart=start
	   ;

relationalOp
		: rop=('<=' |'>=' | '<' | '>')
        ;
		
functionCall
        : VAR'('argumentList?')' 
		;
		
argumentList
        : expression (',' expression)*
		;

parameterList
        : inorout type VAR (',' type VAR)*
		;

function
       : 'function ' VAR  '(' parameterList? ') : ' type  funcStart=start
	   ;
	   
inorout
	: 'in' | 'out' | 'inout'
	;

expression 
         : '-' expression    #exp                                                         
 | e1=expression op=('<=' |'>=' | '<' | '>' | '-') e2=expression #expRelational
 | expression op=('=' | '!=' ) expression #exp3              
 | combinations #exp4                      
 ;
 
 combinations
 : '(' exp=expression ')' #e
 | NUMBER  #n
 | flag=('true' | 'false') #b
 | v1=VAR #v
 | CHKSTRING #s         
 ;
	
varCheck
	:	strtype=type strvar1=VAR
		
		(',' strvar2 = VAR)*
	;

print
	:	'print ' CHKSTRING (',' strvar2 = VAR)*		#printVar
	|	'print ' CHKSTRING (',' functionCall)?		#printFuncCall
	;
	
let 
	: ('let ' v1=VAR '=' simpleexpression) 
	| ('let ' v2=VAR '= (' type ')' simpleexpression )
	;


input 
	:	'input ' v1=VAR (',' v2=VAR)*
	;

	
type
	:	'integer' | 'real'
	;

simpleexpression returns [double value] 
    : first=term '+' next=simpleexpression #additionexp
    | first=term '-' next=simpleexpression #subexp
    | first=term #assign1
    ;	

   
term returns [double value]
    : first=factor '*' next=term #mulexp
    | first=factor '/' next=term #divexp
    | first=factor #assign2
    ;	

factor returns [double value]
    : n=VAR #assign3
    | no=NUMBER #assign4
    ;

CHKSTRING 
	:	'"' (~[\r\n"] | '""')* '"' 
	; 

VAR: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;	
	
NUMBER: ('0'..'9')+;

WS: [ \r\n\t] + -> channel (HIDDEN);