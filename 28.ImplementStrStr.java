import java.util.Scanner;

public class ImplementStrStr {
	public int strStr(String hayStack,String needle){
		int l1=hayStack.length();
		int l2=needle.length();
		
		int threshold=l1-l2;
		for(int i=0;i<threshold;i++){
			if(hayStack.substring(i, i+l2).equals(needle)){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		ImplementStrStr obj=new ImplementStrStr();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter hayStack : ");
		String hayStack=input.next();
		System.out.println("Enter needle : ");
		String needle=input.next();
		
		int out=obj.strStr(hayStack, needle);
		System.out.println(out);
	}
}
