package NewProblems;

public class missingNumInArray {

	public static void main(String[] args)
	{
		int[] a= {1,2,6};
		int e=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(e!=a[i])
			{
				while(e<a[i])
				{
					System.out.println(e++);
				}
			}
			e++;
		}
	}

}
