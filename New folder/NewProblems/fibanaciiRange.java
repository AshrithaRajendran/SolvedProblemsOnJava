package NewProblems;

public class fibanaciiRange {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=a+b;
		while(c<100)
		{
			a=b;
			b=c;
			c=a+b;
		}
		for(int i=100;i<=1000;i++)
		{
			if(c>1000) {
				break;
			}
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
