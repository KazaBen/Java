package assignment2017;

import assignment2017.codeprovided.*;
public class MyGameState extends Connect4GameState {
	public int board[][];
	private int turn;
	public MyGameState(){
		board = new int[NUM_ROWS][NUM_COLS];
		}
	// Sets the board to empty and makes red turn first
	@Override
	public void startGame() {
		for(int i=0;i<NUM_ROWS;i++){
			for(int j=0;j<NUM_COLS;j++){
				this.board[i][j] = Connect4GameState.EMPTY;
			}
		}
		this.turn = Connect4GameState.RED;
	}
	public int getMax(int col){
		for(int i=NUM_ROWS-1;i>-1;i--){
			System.out.println(i);
			if(board[i][col] == Connect4GameState.EMPTY){
				return i;
			} 
			}
		return 0;
		}
	@Override
	public void move(int col) {
		if(getMax(col)!=0){
		if(turn == Connect4GameState.RED){
			board[getMax(col)][col] = Connect4GameState.RED;
		} else if(turn == Connect4GameState.YELLOW){
			board[getMax(col)][col] = Connect4GameState.YELLOW;
		} 
		if(turn == Connect4GameState.RED){
			turn = Connect4GameState.YELLOW;
		} else{
			turn = Connect4GameState.RED;
		}
		} else{
			System.out.println("That column is full. Try again!");
		}
		getWinner();
	}
	public void promt(){

		if(turn==0){
			System.out.println("It's red's turn. Enter column: ");
		} else{
			System.out.println("It's yellow's turn. Enter column: ");
		}
	}
	@Override
	public int whoseTurn() {
		return turn;
	}

	@Override
	public int getCounterAt(int col, int row) throws IllegalColumnException, IllegalRowException {
		return board[row][col];
	}

	@Override
	public boolean isBoardFull() {
		for(int i=0;i<NUM_ROWS;i++){
			for(int j=0;j<NUM_COLS;j++){
				if(board[i][j]==Connect4GameState.EMPTY){ // && No players won the game.
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean isColumnFull(int col) throws IllegalColumnException {
		if(board[getMax(col)][col] == 0){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public int getWinner() {
		int horizontalRed=0;
		int horizontalYellow = 0;
		int verticalRed = 0;
		int verticalYellow = 0;
		for(int i=0;i<NUM_ROWS;i++){
			for(int j=0;j<NUM_COLS;j++){
				//Check horizontal red
				if(board[i][j]==RED){
					horizontalRed++;
					if(horizontalRed>=4){
						System.out.println("Red wins horizontal");
					}
				} else{
					horizontalRed = 0 ;
				}
				if(board[i][j]==YELLOW){
					horizontalYellow++;
					if(horizontalYellow>=4){
						System.out.println("Yellow wins horizontal");
					}
				} else{
					horizontalYellow = 0 ;
				}
			}
		}
		for(int j=0;j<NUM_COLS;j++){
			for(int i=0;i<NUM_ROWS;i++){
				//Check horizontal red
				if(board[i][j]==RED){
					verticalRed++;
					if(verticalRed>=4){
						System.out.println("Red wins vertical");
					}
				} else{
					verticalRed = 0 ;
				}
				if(board[i][j]==YELLOW){
					verticalYellow++;
					if(verticalYellow>=4){
						System.out.println("Yellow wins vertical");
					}
				} else{
					verticalYellow = 0 ;
				}
			}
		}
		return 0;
	}

	@Override
	public boolean gameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connect4GameState copy() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getRows(){
		return NUM_ROWS;
	}
	public int getCols(){
		return NUM_COLS;
	}
}
