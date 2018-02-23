import java.util.Scanner;

public class MathPow {
	public double myPow(double x,int n){
		if(n==0){
			return 1;
		}
		if(n==Integer.MIN_VALUE){
			x=x*x;
			n=n/2;
		}
		if(n<0){
			n=-n;
			x=1/x;
		}
		return (n%2==0) ? myPow(x*x,n/2) : x*myPow(x*x,(n-1)/2);
	}
	
	public static void main(String[] args) {
		MathPow obj=new MathPow();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number : ");
		double x=input.nextDouble();
		System.out.println("Enter power : ");
		int n=input.nextInt();
		double out=obj.myPow(x,n);
		System.out.println("Output = "+out);
		
	}
}
