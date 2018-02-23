import java.util.Scanner;

public class AddBinary {
	public String addBinary(String a,String b){
		StringBuilder sb=new StringBuilder();
		int carry=0;
		int i=a.length()-1;
		int j=b.length()-1;
		
		while(i>=0 || j>=0){
			int sum=carry;
			if(i>=0){
				sum+=a.charAt(i)-'0';
			}
			if(j>=0){
				sum+=b.charAt(j)-'0';
			}
			sb.append(sum%2);
			carry=sum/2;
			i--;
			j--;
		}
		if(carry!=0){
			sb.append(carry);
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		AddBinary obj=new AddBinary();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String a :");
		String a=input.next();
		System.out.println("Enter String b :");
		String b=input.next();
		String output=obj.addBinary(a,b);
		System.out.println(output);
	}
}
