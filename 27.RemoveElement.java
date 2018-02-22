import java.util.Scanner;

public class RemoveElement {
	public int removeElemet(int[] nums,int val){
		int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
	}
	
	public static void main(String[] args) {
		RemoveElement obj=new RemoveElement();
		Scanner input=new Scanner(System.in);
		int[] array=new int[5];
		System.out.println("Enter array elements : ");
		for(int i=0;i<array.length;i++){
			array[i]=input.nextInt();
		}
		
		System.out.println("Enter the value to be removed");
		int value=input.nextInt();
		
		int n=obj.removeElemet(array, value);
		
		for(int i=0;i<n;i++){
			System.out.println(array[i]);
		}
	}
}
