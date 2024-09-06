package NewProblems;

public class Diamondpattern {

	public static void main(String[] args) {
		int num=9;
		int spaces=num/2;
		int star=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" "+" ");
			}
				for(int k=1;k<=star;k++)
				{
					if(k==1 || k==star) {
					System.out.print("*"+" ");
					}
					else
					{
						System.out.print(" "+" ");
					}
			    }
				if(i<=num/2)
				{
					spaces--;
					star+=2;
				}
				else
				{
					spaces++;
					star-=2;
					
				}System.out.println();
		}
		
	}

}
