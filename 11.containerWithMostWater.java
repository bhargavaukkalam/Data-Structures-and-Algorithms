import java.util.Scanner;

public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[] height){
		int maxArea=0;
		int start=0;
		int end=height.length-1;
		
		while(start<end){
			maxArea=Math.max(maxArea,Math.min(height[start],height[end])* (end-start));
//			System.out.println("MaxArea = " + maxArea + " left = "+start +" Right ="+end);
//			System.out.println(maxArea);
			if(height[end]>height[start]){
				start++;
			}
			else{
				end--;
			}
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		MaxAreaOfIsland objmax=new MaxAreaOfIsland();
		int[] inArray=new int[9];
		System.out.println("Enter input :");
		for(int i=0;i<inArray.length;i++){
			inArray[i]=input.nextInt();
		}
		
		int out =objmax.maxAreaOfIsland(inArray);
		System.out.println("Max area of island is :");
		System.out.println(out);
		
	}
}
