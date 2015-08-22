
public class PrintAllSum {
	
	public static void main(String[] args) {
		int t = 5;
		String R[][] = new String[t+1][];
		R[0] =new String[0];
		for(int i = 1; i <= t; i++){
			R[i] = new String[(i/2) + 1];
			for( int j = 1; j <= i/2; j++){
				R[i][j] = (i-j) + "+" + j + "";
			}
		}
		System.out.println(" -> ["+t+"] =  ");
		for(int i = t; i >= 0 ; i-- ){
			for(int j = 1; j < R[i].length; j++){
				System.out.print(R[i][j]);
				for(int x= i; x < t; x++){
					 System.out.print("+1");
				}
				System.out.print(", ");
				
			}
			System.out.println();
		}
		System.out.println();
	}

}
