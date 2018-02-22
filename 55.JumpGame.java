/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
*/
import java.util.Scanner;

public class JumpGame {
	public boolean canJump(int[] nums){
		int maxLength=0;
		
		for(int i=0;i<nums.length;i++){
			if(i>maxLength){
				return false;
			}
			maxLength=Math.max(maxLength, i+nums[i]);
		}
		return true;
	}
	
	public static void main(String[] args) {
		JumpGame obj=new JumpGame();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array : ");
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			array[i]=input.nextInt();
		}
		boolean out=obj.canJump(array);
		System.out.println(out);
	}
}
/*Logic : The maximum distance from each point that could be
traversed would be computed by i+nums[i]. Just compute the
maximum of all these values and check if any value is less than 
the index i , which means we cant reach end of array and return false.
Else we will reach end of array

Eg:1
[3,2,1,0,4]-false
maxlength= 3
i+nums[i]= 3
i = 0

maxlength= 3
i+nums[i]= 3
i = 1

maxlength= 3
i+nums[i]= 3
i = 2

maxlength= 3
i+nums[i]= 3
i = 3

Eg:2
[2,3,1,1,4]-true
maxlength= 2
i+nums[i]= 2
i = 0

maxlength= 4
i+nums[i]= 4
i = 1

maxlength= 4
i+nums[i]= 3
i = 2

maxlength= 4
i+nums[i]= 4
i = 3

maxlength= 8
i+nums[i]= 8
i = 4
*/
