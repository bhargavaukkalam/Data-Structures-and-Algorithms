import java.util.Scanner;

public class SearchInsertPosition {
	  public int searchInsert(int[] nums, int target) {
	        int low=0;
	        int high=nums.length-1;
	        while(low<=high){
	            int mid=low+(high-low)/2;
	            
	            if(nums[mid]==target){
	                return mid;
	            }
	            
	            if(nums[mid]>target){
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        return low;
	        
	    }
	  
	  public static void main(String[] args) {
		  SearchInsertPosition obj=new SearchInsertPosition();
		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter array : ");
		  int[] array=new int[5];
		  for(int i=0;i<array.length;i++){
			  array[i]=input.nextInt();
		  }
		  System.out.println("Enter target : ");
		  int target=input.nextInt();
		  int output=obj.searchInsert(array, target);
		  System.out.println("Output is : "+output);
	}
}
