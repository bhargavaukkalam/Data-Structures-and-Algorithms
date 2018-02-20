/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

import java.util.Scanner;
*/

public class MaxArea {
	public int maxAreaWater(int[] height){
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
		MaxArea objmax=new MaxArea();
		int[] inArray=new int[9];
		System.out.println("Enter input :");
		for(int i=0;i<inArray.length;i++){
			inArray[i]=input.nextInt();
		}
		
		int out =objmax.maxAreaWater(inArray);
		System.out.println("Max area of island is :");
		System.out.println(out);
		
	}
}
