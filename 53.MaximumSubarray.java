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
