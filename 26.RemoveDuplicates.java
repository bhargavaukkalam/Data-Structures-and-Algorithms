/*
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
*/
import java.util.Scanner;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums){
		if(nums.length==0){
			return 0;
		}
		int j=0;
		for(int i=0;i<nums.length;i++){
			if(nums[j]!=nums[i]){
				j++;
				nums[j]=nums[i];
			}	
		}
		return j+1;
	}
	
	public static void main(String[] args) {
		RemoveDuplicates obj=new RemoveDuplicates();
		Scanner input=new Scanner(System.in);
		int[] array=new int[5];
		System.out.println("Enter input : ");
		for(int i=0;i<array.length;i++){
			array[i]=input.nextInt();
		}
		int n=obj.removeDuplicates(array);
	
		for(int i=0;i<n;i++){
			System.out.print(array[i]+ " ");
		}
		
	}
}
