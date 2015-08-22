import java.util.HashSet;
import java.util.Set;


public class LargestNonRepetiveSubString {
	
	private char [] input;
	private int len;
	
	public LargestNonRepetiveSubString(String input) {
		
		this.input = input.toCharArray();
		this.len = input.length();
	}
	
	public void getLargestSubstring(){
		
		int start=0,length=0;
		Set<Character> testSet = new HashSet<Character>();
		
		for(int i=0;i<len;i++){
			
			testSet.clear(); 
			for(int j = i; j <len ;j++){
				
				if(!testSet.add(input[j])){
					
					if((j-i) > length){
						
						length = j-i;
						start = i;
					}
					break;
				}
			}
			
		}
		for(int i=start;i<=length;i++){
			
			System.out.print(input[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		LargestNonRepetiveSubString test = new LargestNonRepetiveSubString("abcdaghijcd");
		test.getLargestSubstring();
	}

}
