import java.util.Scanner;

public class SqrtX {
	public int sqrtX(int x){
		long r=x;
		while(r*r>x){
			r=(r+x/r)/2;
		}
		return (int) r;
	}
	
	public static void main(String[] args) {
		SqrtX obj=new SqrtX();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Integer : ");
		int val=input.nextInt();
		int out=obj.sqrtX(val);
		System.out.println("Sqrt is : "+out);
			
	}
}
