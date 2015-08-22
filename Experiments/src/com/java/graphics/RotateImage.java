package com.java.graphics;

public class RotateImage {
	
	int image[][] = new int[][]{
			{1,2,3},
			{1,1,1},
			{1,2,3}
	}; 
	
	public void PrintImage(int[][] image) {
		
		for(int i=0;i<image.length;i++){
			for(int j=0;j<image[i].length;j++){
				
				System.out.print(image[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public void rotateByNinety(){
		
		int[][] imageBuffer = new int[image[0].length][image.length];
		
		for(int i=0;i<image.length;i++){
			
			for(int j=0;j<image[i].length;j++){
				
				imageBuffer[j][(image.length)-1-i] = image[i][j];
			}
		}
		
		System.out.println("printing the image");
		PrintImage(image);
		System.out.println("printing the image rotated by 90");
		PrintImage(imageBuffer);
		
	}
	
	public void rotateInplace(){
		
		int m = image.length;
		int n = image[0].length;
		
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				Integer temp = image[i][j];
				image[i][j] = image[m-j-1][i];
				image[m-j-1][i] = image[m-i-1][n-1-j];
				image[m-i-1][n-1-j]= image[j][n-1-i];
				//image[j][n-1-i] = temp;
			}
		}
		
		System.out.println("Rotated matrix ");
		PrintImage(image);
	}
	
	public static void main(String[] args) {
		
		RotateImage ri = new RotateImage();
		ri.rotateInplace();
	}
}
