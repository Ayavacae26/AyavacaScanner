// token class

public class Token {
	private String lexeme;  //defining the lexeme as a string 
	private TokenType tokentype; //defining the type of token
	
	// Constructs a Token based on lexeme and tokentype
	public Token(String lexeme, TokenType tokentype){ 
		this.lexeme = lexeme;
		this.tokentype =tokentype;
	}
	
	//getters and setters for lexeme and token type
	
	public String getlexeme(){
		return this.lexeme;
	}
	
	public void setlexeme(String lexeme){
		this.lexeme = lexeme;
	}
	
	public String getTokenType(){
		return this.tokentype;
	}
	
	public void setTokenType(TokenType tokentype){
		this.tokentype = tokentype;
	}
	
	//ToString to reterive the information
	
	




}


