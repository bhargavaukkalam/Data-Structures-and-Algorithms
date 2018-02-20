/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1].
*/


import java.util.HashMap;
import java.util.Scanner;

public class TwoSum1 {
	public int[] twoSum(int[] nums,int target){
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] result=new int[2];
		
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				result[0]=i;
				result[1]=map.get(target-nums[i]);
			}
			else if(map.containsKey(nums[i])){
				continue;
			}
			else{
				map.put(nums[i], i);
			}
		}
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] newArray=new int[4];
		for(int i=0;i<newArray.length;i++){
			System.out.print("Enter number :");
			newArray[i]=input.nextInt();
		}
		
		TwoSum1 obj=new TwoSum1();
		obj.twoSum(newArray, 5);
		
		
	}
}
