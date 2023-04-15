package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPosition;
import chess.chessPiece;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChesPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChesPosition(sc);
			
			
			chessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
	
}
