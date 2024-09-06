package NewProblems;

public class TwoOutputs {

	public static void main(String[] args) {
		int a[]= {1,2,1,6};
		int[] b=new int[a.length*2];
		int[] c=new int[a.length];
		int t=0;
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[t];t++;
			if(t==a.length)t=0;
			
		}
		for(int h:b)
		{
			System.out.print(h);
		
	}

}
}