package assignment2017;
import assignment2017.codeprovided.*;
public class Connect4ConsoleDisplay{
	public static void display(MyGameState gameState, int rows,int cols){
		for(int i=0;i<rows+3;i++){
			for(int j=0;j<8;j++){
				 if((j==0 || j==cols) && i>-1 && i< rows){
						System.out.print("|");
					}
				 if(i>-1 && i< rows && j>-1 && j<cols){
					if((gameState.board[i][j])==(-1)){
						System.out.print("   ");
					} else if(gameState.board[i][j] == 0){
						System.out.print(" R ");
					} else if(gameState.board[i][j] == 1){
						System.out.print(" Y ");
					}
					} else if(i==rows+1 && j< cols){
						if(j==0){
							System.out.print(" ");
						}
					System.out.print("---");
					} else if(i==rows+2&& j>-1 && j<cols){
						if(j == 0){
							System.out.print(" ");
						}
					System.out.print(" "+j+" ");
					}

		}	if(i!=rows){
			System.out.println();
		}	

	}
}
}