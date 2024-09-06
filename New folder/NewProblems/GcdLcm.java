package NewProblems;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int gcd=1;int lcm=1;
		int min=(a>b)?b:a;
		for(int i=1;i<=min;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		lcm=(a*b)/gcd;
		System.out.println(lcm);

	}

}
