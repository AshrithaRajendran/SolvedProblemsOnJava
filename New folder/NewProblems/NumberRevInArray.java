package NewProblems;

public class NumberRevInArray {
	public static void main(String[] args) {
		int[] a= {27,53,12,99};
		for(int i=0;i<a.length;i++)
		{
			a[i]=rev(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int rev(int n)
	{
		int m=0;
		while(n>0)
		{
			m=(m*10)+n%10;
			n/=10;
		}
		return m;
	}
}
