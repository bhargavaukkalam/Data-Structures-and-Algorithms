/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/

import java.util.Scanner;

public class ZigZagConversion {
	
	public String convert(String s, int numRows){
		int index=0;
		StringBuilder[] st=new StringBuilder[numRows];
		
		for(int i=0;i<st.length;i++){
			st[i]=new StringBuilder();
		}
		
		while(index<s.length()){
			
			for(int i=0;i<numRows && index<s.length();i++){
				st[i].append(s.charAt(index++));
			}
			
			for(int i=numRows-2;i>0 && index<s.length();i--){
				st[i].append(s.charAt(index++));
			}
			
		}
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<st.length;i++){
			result.append(st[i]);
		}
		
	
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ZigZagConversion obj=new ZigZagConversion();
		System.out.println("Enter input :");
		String out=obj.convert(input.nextLine(), input.nextInt());
		System.out.println(out);
	}
	
	
}
