package NewProblems;

public class NextPrime1 {

	public static void main(String[] args) {
		int n=6;
		n=n++;
		boolean flag=true;
		int count=0;
		while(count==0)
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
//					boolean f=false;
					flag=false;
					break;
				}
				else
				{
					flag=true;
				}
			}
			if(flag)
			{
				System.out.println(n);
				count++;
			}
			else
			{
				n=n+1;
			}
		}
	}
}
