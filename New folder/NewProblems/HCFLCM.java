package NewProblems;

import java.util.Scanner;

public class HCFLCM {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int tempa=a;
		int tempb=b;int temp;int HCF;int LCM;
		while(tempb!=0)
		{
			 temp=tempb;
			 tempb=tempa%tempb;
			 tempa=temp;	
		}
		HCF=tempa;
		LCM=(a*b)/HCF;
		System.out.println(HCF);
		System.out.println(LCM);
		
	}	

}
