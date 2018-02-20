/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
*/
import java.util.Scanner;

public class RevereseInteger {
	
	public int reverse(int x){
		int result=0;
		while(x!=0){
			int tail=x%10;
			int tempresult=result*10+tail;
			if((tempresult-tail)/10!=result){
				return 0;
			}
			result=tempresult;
			x=x/10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		RevereseInteger obj=new RevereseInteger();
		System.out.println("Enter number");
		int output=obj.reverse(input.nextInt());
		System.out.println(output);
	}
}
