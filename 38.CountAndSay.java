import java.util.Scanner;

public class CountAndSay {
	public String countAndSay(int n){
		String s="1";
		for(int i=1;i<n;i++){
			StringBuilder sb=new StringBuilder();
			for(int j=1,count=1;j<=s.length();j++){
				if(j==s.length() || s.charAt(j)!=s.charAt(j-1)){
					sb.append(count);
					sb.append(s.charAt(j-1));
					count=1;
				}
				else{
					count++;
				}
			}
			s=sb.toString();
		}
		return s;
	}
	
	public static void main(String[] args) {
		CountAndSay obj=new CountAndSay();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=input.nextInt();
		String output=obj.countAndSay(num);
		System.out.println(output);
	}
}
