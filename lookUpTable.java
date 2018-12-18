import java.util.HashMap;


public class lookUpTable extends HashMap<String, TokenType{
	public lookUpTable(){
		HashMap<String, TokenType> Map = new HashMap<String, TokenType>();
			this.put("AND", TokenType.AND);
			PROGRAM,
			ARRAY,
			BEGIN,
			DIV,
			DO,
			ELSE,
			FUNCTION,
			IF,
			INTERGER,
			DIGIT,
			MOD,
			NOT,
			OF,
			OR,
			PROCEDURE,
			REAL,
			THEN,
			VAR,
			WHILE,
		
			//SYMBOLS
			SEMICOLON,
			COMMA,
			COLON,
			PERIOD,
			LEFTBRACKET,
			RIGHTBRACKET,
			LEFTPARENTHESES,
			RIGHTPARENTHESES,
			PLUS,
			MINUS,
			EQUALS,
			LESS_THAN,
			LESS_THAN_OR_EQUAL,
			GREATER_THAN,
			GREATER_THAN_OR_EQUAL,
			ASTERISK,
			SLASH,
			ASSIGN,
			GUILLEMENTS,
		
	}
}