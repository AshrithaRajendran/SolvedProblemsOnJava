package NewProblems;

public class NextPrimeNumber {
	public static void main(String[] args) {
		int a[]= {6,14,21,39};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			if(isPrime(n))
			{
				a[i]=n;
			}
			else
			{
				for(int j=n; ;j++)
				{
					if(isPrime(j))
					{
						a[i]=j;
						break;
					}
				}	
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static boolean isPrime(int n)
	{
		int num=n;
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		if(flag)return true;
		else return false;
	}

}
