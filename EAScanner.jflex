/**
* In this Jflex file. I will be creating a scanner that has lexem definition in order
* to recognize  different tokens. 
*/

/* Declarations */

%%
%standalone         /* The produced java file has a main */
%class  MyScanner   /* Names the produced java file */
%function nextToken /* Renames the yylex() function */
%type   String      /* Defines the return type of the scanning function */
%eofval{
  return null;
%eofval}

/* -----Patterns------ */

other  = .
letter = [A-Za-z]
//word = {letter}+
digit =[0-9]
number = {digit}+
whitespace    = [ \n\t\r]
id = {letter}{digit}|{letter}*
symbol = [;,:\.\[\]\(\)+-\=<*/]|:=|<=|>=|<>


%%
/* --------Lexical Rules------ */

/*{word}     {
             /** Print out the word that was found. */
             System.out.println("Found a word: " + yytext());
             return( yytext());
            }*/
            
{letter}  	{
             /** Print out the letter that was found. */
             System.out.println("Found a letter: " + yytext());
             return( yytext());
            }
            
{digit}  	{
             /** Print out the digit that was found. */
             System.out.println("Found a digit: " + yytext());
             return( yytext());
            }

{number}  	{
             /** Print out the number that was found. */
             System.out.println("Found a number: " + yytext());
             return( yytext());
            }
            
{id}  	{
             /** Print out the id that was found. */
             System.out.println("Found a id: " + yytext());
             return( yytext());
            }
{symbol}  	{
             /** Print out the symbol that was found. */
             System.out.println("Found a symbol: " + yytext());
             return( yytext());
            }
            
{whitespace}  {  /* Ignore Whitespace */ 
                 return "";
              } 

{other}    { 
             System.out.println("Illegal char: '" + yytext() + "' found.");
             return "";
           }