import java.util.Scanner;

public class SearchRotatedSortedArray {
	 public int search(int[] nums, int target) {
	        int value=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==target){
	                value=i;
	                return value;  
	            }
	        }
	        
	        return -1;
	    }
	 
	 public static void main(String[] args) {
		 SearchRotatedSortedArray obj=new SearchRotatedSortedArray();
		 Scanner input=new Scanner(System.in);
		 int[] array=new int[7];
		 System.out.println("Enter array : ");
		 for(int i=0;i<array.length;i++){
			 array[i]=input.nextInt();
		 }
		 System.out.println("Enter target : ");
		 int target=input.nextInt();
		 int output=obj.search(array,target);
		 System.out.println(output);
	}
}
