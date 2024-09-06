package NewProblems;

import java.util.Scanner;
public class reverseAString {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String[] s= new String[n];
		for(int j=0;j<s.length;j++)
		{
			s[j]=scn.next();
		}
		int e=s.length-1;
		for(int i=0;i<s.length/2;i++)
		{
			String t=s[i];
			s[i]=s[e];
			s[e]=t;
			e--;
		}
		for(String f:s)
		{
			System.out.print(f);
		}
	}
}
