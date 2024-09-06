package NewProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidPhoneNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("eneter no");
		String phoneno=scn.next();
		String exp="[6-9][0-9]{9}";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(phoneno);
		if (m.matches()) System.out.println("valid");
		else System.out.println("invalid");
	}
}
