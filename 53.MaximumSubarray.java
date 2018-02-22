/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/
import java.util.Scanner;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int maxEndingHere=nums[0];
        int maxSoFar=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndingHere=Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }
	
	public static void main(String[] args) {
		MaximumSubarray obj=new MaximumSubarray();
		Scanner input=new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Enter array : ");
		for(int i=0;i<10;i++){
			array[i]=input.nextInt();
		}
		int output=obj.maxSubArray(array);
		System.out.println(output);
		
	}
}
