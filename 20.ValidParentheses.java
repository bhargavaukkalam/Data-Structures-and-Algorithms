import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	
	public boolean validParentheses(String s){
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			
			if(c=='{'){
				stack.push('}');
			}
			else if(c=='['){
				stack.push(']');
			}
			else if(c=='('){
				stack.push(')');
			}
			else if(stack.isEmpty() || stack.pop()!=c){
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		ValidParentheses obj=new ValidParentheses();
		Scanner input=new Scanner(System.in);
		
		while(true){
		System.out.print("Enter input string : ");
		String in=input.next();
		if(obj.validParentheses(in)){
			System.out.println("Valid Parenthesis");
		}
		else{
			System.out.println("Not Valid Parenthesis");
		}
	}
	}
}
