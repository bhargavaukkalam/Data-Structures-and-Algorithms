import java.util.Scanner;

public class SortColors {
	public void sortColors(int[] nums){
		int one=0,two=0,zero=0;
		int i=0,j=0,k=0;
		
		for(i=0;i<nums.length;i++){
			if(nums[i]==0){
				zero++;
			}
			else if(nums[i]==1){
				one++;
			}
			else if(nums[i]==2){
				two++;
			}
		}
		for(i=0;i<zero;i++){
			nums[i]=0;
		}
		for(j=zero;j<zero+one;j++){
			nums[j]=1;
		}
		for(k=zero+one;k<nums.length;k++){
			nums[k]=2;
		}
	}
	
	public static void main(String[] args) {
		SortColors obj=new SortColors();
		Scanner input=new Scanner(System.in);
		int[] array=new int[8];
		System.out.println("Enter input array : ");
		for(int i=0;i<array.length;i++){
			array[i]=input.nextInt();
		}
		obj.sortColors(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
