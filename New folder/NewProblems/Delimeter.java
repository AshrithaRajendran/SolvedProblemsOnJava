package NewProblems;

import java.util.Scanner;

public class Delimeter {

	public static void main(String[] args) {
		String s="RAVEESH is manager of jsipder hi";
		int count=0;
		Scanner scn=new Scanner(s);
		scn=scn.useDelimiter(" ");
while(scn.hasNext())
{
	count++;
	scn.next();
}
System.out.println(count);
	}

}
