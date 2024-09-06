package NewProblems;

import java.util.Arrays;

public class missingnum {
	public static void main(String[] args) {
		int[] a= {1,10,3};
		Arrays.sort(a);
		int s=a[0];
		int e=a[a.length-1];
		for(int i=s;i<e;i++)
		{
			if(check(a,i))
			{
				System.out.println(i);
			}
		}
	}
public static boolean check(int[] a,int j)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==j)return false;
		
	}return true;
}
}
