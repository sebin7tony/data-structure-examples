package com.java.recursion;

public class EightQueens {
	
	private int[][] board ;
	
	public EightQueens() {
		
		board = new int[4][4];
	}
	
	
	public void printBoard(){
		
		for(int i=0;i<board.length;i++){
			
			for(int j=0;j<board.length;j++){
				
				System.out.print(board[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public boolean isSafe(int row,int col){
		
		for(int k=0;k<board.length;k++){
			
			if(board[row][k] == 1){
				
				return false;
			}
			
			if(board[k][col] == 1){
				
				return false;
			}
		}
		
		int count = 0;
		for(int i=col-1;i>=0;i--){
			count++;
			int x1 = row - count;
			int x2 = row + count;
			if(x1 >= 0){
				
				if(board[x1][i] == 1){
					return false;
				}
			}
			
			if(x2 < 4){
				
				if(board[x2][i] == 1){
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean nqueen(int[][] board1,int col){
		
		if(col == board1.length){
			
			
			System.out.println("Nqueen Solved");
			for(int i=0;i<4;i++){
				
				for(int j=0;j<4;j++){
					
					System.out.print(board[i][j]);
				}
				System.out.println("");
			}
			return true;
		}
		for(int i=0;i<board1.length;i++){
			
			if(isSafe(i,col) == true){
				
				board1[i][col] = 1;
				if(!nqueen(board1, col+1)){
					
					board1[i][col] = 0;
				}
			}
		}
		return false;
	}
	
	
	public void invoker(){
		
		if(nqueen(board, 0)){
			
			System.out.println("Nqueen Solved");
			for(int i=0;i<4;i++){
				
				for(int j=0;j<4;j++){
					
					System.out.print(board[i][j]);
				}
				System.out.println("");
			}
		}
		else{
			
			System.out.println("Not solved");
		}
	}
	
	public static void main(String[] args) {
		
		EightQueens queens = new EightQueens();
		queens.invoker();
	}
}
