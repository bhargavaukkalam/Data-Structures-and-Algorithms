import java.util.Scanner;

public class PalindromeNumber {
	
	public boolean isPalindrome(int x){
		int revnum=0;
		if(x<0 || x!=0 && x%10==0){
			return false;
		}
		
		while(x>revnum){
			revnum=revnum*10+x%10;
			x=x/10;
		}
		return (x==revnum || x==revnum/10);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PalindromeNumber obj=new PalindromeNumber();
		while(true){
		System.out.println("Enter input : ");
		boolean output=obj.isPalindrome(input.nextInt());
		System.out.println(output);
		}
	}
}
