import java.util.ArrayList;
import java.util.List;


public class NQueen {
	
	private List<Integer> queenArray;
	private Integer N;
	
	public NQueen(int number) {
		this.N = number;
		this.queenArray = new ArrayList<Integer>();
	}
	
	private void NQueenMethod(List<Integer> queenList,int col,int length){
		
		
		if(queenList.size() == length ){
			System.out.println("Checking here");
			return;
		}
		
		
		for(int i=0;i<length;i++){
			
			
			
			if(isSafe(i, col)){
				
				
				queenList.add(col, i);
				NQueenMethod(queenList, col+1, length);
			}
		}
		if(queenList.size() >= col){
			
			System.out.println("inside remove "+col);
			try{
				queenList.remove(col-1);
			}
			catch(ArrayIndexOutOfBoundsException e){
				
				return;
			}
		}
		
	}
	
	private boolean isSafe(int row,int col){
		
		for(int i=0;i<this.N ; i++){
			
			if(queenArray.size() >= i+1 && row == queenArray.get(i)){
				System.out.println("isSafe false 1");
				return false;
			}
		}
		
		if(queenArray.size() >= col+1 ){
			
			System.out.println("isSafe false 2");
			return false;
		}
		
		for(int i=0;i<this.N;i++){
			
			if(queenArray.size() >= i+1 ){
				
				if(Math.abs(queenArray.get(i) - row) == Math.abs(i-col)){
					
					System.out.println("isSafe false 3");
					return false;
				}
			}
		}
		return true;
	}
	
	public List<Integer> invokeQueen(){
		
		NQueenMethod(this.queenArray, 0,this.N);
		int col=0;
		for(Integer value : queenArray){
			
			System.out.println("(x,y) = ("+value+","+col+") :");
			col++;
		}
		return this.queenArray;
	}
	
	public static void main(String[] args) {
		
		NQueen nqueen = new NQueen(4);
		nqueen.invokeQueen();
		
	}

}
