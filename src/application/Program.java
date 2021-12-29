package application;

import java.awt.print.Printable;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CutAction;

import boardgame.Board;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
 
public class Program {

	public static void main(String[] args) {
		
		Position pos = new Position(3,5);
		System.out.println(pos);

		Board board = new Board(8, 8);
		System.out.println(pos);
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while(true) {

			try {
				UI.clearScreen(); 
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean [][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen(); 
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

	private static String cutIntegerLeft(String numStr, int digitLimit) {
		if(numStr.length() > digitLimit) {
			return "" + Long.parseLong(numStr, 10) % (int) Math.pow(10,  digitLimit);
			}
		return numStr;
	}
	

		/*
			System.out.println(cutIntegerLeft("600000", 5));
		System.out.println(cutIntegerLeftTwo("600000", 5));
	
	private static String cutIntegerLeftTwo(String numStr, int digitLimit) {
		if(numStr.length() > digitLimit) {
			return numStr.substring(numStr.length() - digitLimit, numStr.length());
			}
		return numStr;
	}*/
	
}