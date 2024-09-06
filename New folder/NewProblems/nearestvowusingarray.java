package NewProblems;

import java.util.Scanner;

public class nearestvowusingarray {

	public static void main(String[] args) {
		char[] c=new char[26];
		Scanner scn=new Scanner(System.in);
		char c1=scn.next().charAt(0);
		for(int i=c1+1;i<='z';i++)
		{
			if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u')
			{
				System.out.println((char)i);
				break;
			}
		}

	}

}
