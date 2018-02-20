/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

import java.util.Scanner;

public class RomanToInt {
	
	public int romanToInt(String s) {
        char[] c=s.toCharArray();
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
        switch(c[i]){
            case 'I':
                sum+=(sum>=5?-1:1);
                break;
            case 'V':
                sum+=5;
                break;
            case 'X':
                sum+=10*(sum>=50?-1:1);
                break;
            case 'L':
                sum+=50;
                break;
            case 'C':
                sum+=100*(sum>=500?-1:1);
                break;
            case 'D':
                sum+=500;
                break;
            case 'M':
                sum+=1000;
                break;
            default:
            
        }
    }
        return sum;
    }
	
	public static void main(String[] args) {
		RomanToInt obj=new RomanToInt();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter input : ");
		int output=obj.romanToInt(input.nextLine());
		System.out.println(output);
		
	}
}
