package boardgame;

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	
	//hook method: m�todo concreto que usa um m�todo abstracto
	//m�todo que depende dum m�todo abstracto, existe templates com padr�o de implementa��o
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
	