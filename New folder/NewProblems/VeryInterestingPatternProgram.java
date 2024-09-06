package NewProblems;

public class VeryInterestingPatternProgram {

	public static void main(String[] args)
	{
		        int n=5;
		        int temp=1;
		        int temp1=n*(n+1);
		        for(int i=5;i>=1;i--)
		        {
		            for(int space=1;space<=n-i;space++)
		            {
		                System.out.print(" "+"\t");
		            }
		            temp1=temp1-i+1;
		            for(int j=1;j<=i*2;j++)
		            {
		                if(j<=i)
		                {
		                    System.out.print(temp+"\t");
		                    temp++;
		                }
		                else
		                {
		                    System.out.print(temp1+"\t");
		                    temp1++;
		                }
		            }
		            temp1=temp1-i-1;
		            System.out.println();
		        }
		    }
		
		
	}


