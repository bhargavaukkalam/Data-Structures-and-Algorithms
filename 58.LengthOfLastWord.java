import java.util.Scanner;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && count>=1){
                break;
            }
            else if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("count="+count);
        return count;
    }
	
	public static void main(String[] args) {
		LengthOfLastWord obj=new LengthOfLastWord();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter string : ");
		String sentence=input.nextLine();
		int output=obj.lengthOfLastWord(sentence);
		System.out.println(output);
	}
}
