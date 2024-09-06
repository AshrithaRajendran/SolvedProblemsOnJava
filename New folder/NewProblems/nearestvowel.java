package NewProblems;

import java.util.Scanner;

public class nearestvowel {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scn.next().charAt(0);
		printNextVowel(++ch);	
	}
	public static void printNextVowel(char ch) {
		while(true)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
				break;
			}
			ch++;
		}
	}
	

}
