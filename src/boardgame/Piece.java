package boardgame;

public class Piece {
	
	// para não estar visível na camada de xadrez (package diferente não tem acesso)
	protected Position position;
	// conhece a classe board
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	public Board getBoard() {
		return board;
	}
	
	
	

}
