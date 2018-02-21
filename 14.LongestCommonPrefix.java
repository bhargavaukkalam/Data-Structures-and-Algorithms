import java.util.Scanner;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs){
		if(strs.length==0){
			return "";
		}
		
		String str=strs[0];
		
		for(int i=1;i<strs.length;i++){
			while(strs[i].indexOf(str)!=0){
				str=str.substring(0,str.length()-1);
				
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix lcp=new LongestCommonPrefix();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of input Strings : ");
		int in=input.nextInt();
		System.out.println("Enter input String array :");
		String[] array=new String[in];
		for(int i=0;i<array.length;i++){
			array[i]=input.next();
			
		}
		//String[] array={"leetcode","leet","leets","le"};
		String out=lcp.longestCommonPrefix(array);
		System.out.println("OUTPUT IS :"+out);
	}
}
