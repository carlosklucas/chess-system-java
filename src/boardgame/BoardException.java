package boardgame;

public class BoardException extends RuntimeException {

	private Position pos;
	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}
	
	

}
