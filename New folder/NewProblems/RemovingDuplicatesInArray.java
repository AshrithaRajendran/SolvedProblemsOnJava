package NewProblems;

import java.util.Arrays;

public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,2,3,1,4};
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		j++;
		for(int k=0;k<j;k++)
		{
			System.out.println(a[k]);
		}
}}


