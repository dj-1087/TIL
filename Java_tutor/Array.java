package chapter2;

public class Array {
	
	 public static void main(String[] args) {

	      int arr[][] = new int[4][4];
	      int x, y, cnt=0;

	      while(cnt < 10) {
	         x = (int)(Math.random()*4); 
	         y = (int)(Math.random()*4); 
	         if(arr[y][x]==0) { 
	            arr[y][x] = (int)(Math.random()*10+1);
	            cnt++;
	         }
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }
}
