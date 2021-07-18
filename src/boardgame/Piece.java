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
	
	// para ser acessível apenas na camada de tabueleiro e sublclasses (Piece vai gerar cavalo, peao, etc)
	protected Board getBoard() {
		return board;
	}
	
	
	

}
	