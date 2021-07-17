package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	private int getRows() {
		return rows;
	}

	private void setRows(int rows) {
		this.rows = rows;
	}

	private int getColumns() {
		return columns;
	}

	private void setColumns(int columns) {
		this.columns = columns;
	}

	

}
