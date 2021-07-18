package boardgame;

public class Piece {
	
	// para n�o estar vis�vel na camada de xadrez (package diferente n�o tem acesso)
	protected Position position;
	// conhece a classe board
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	// para ser acess�vel apenas na camada de tabueleiro e sublclasses (Piece vai gerar cavalo, peao, etc)
	protected Board getBoard() {
		return board;
	}
	
	
	

}
	