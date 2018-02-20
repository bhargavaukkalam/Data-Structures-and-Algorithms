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
