
public class kadanesAlgo {
	
	public void algo(){
		
		String string = "-2,-3,4,-1,-2,1,5,-3";
	    String[] numbers = string.split(",");
	    int max_so_far = 0;
	    int max_ending_here = 0;
	    for (String num : numbers) {
	        int x = Integer.parseInt(num);
	        max_ending_here = Math.max(0, max_ending_here + x);
	        max_so_far = Math.max(max_so_far, max_ending_here);
	    }
	    System.out.println(max_so_far);
	}
	
	public static void main(String[] args) {
		
		kadanesAlgo kd = new kadanesAlgo();
		kd.algo();
	}

}
