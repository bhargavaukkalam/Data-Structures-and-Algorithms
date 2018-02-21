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
