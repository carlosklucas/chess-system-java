package boardgame;

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	
	//hook method: método concreto que usa um método abstracto
	//método que depende dum método abstracto, existe templates com padrão de implementação
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
					}
				}
		} 
		return false;
	}

}
	