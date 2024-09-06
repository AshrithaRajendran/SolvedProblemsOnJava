package NewProblems;

public class zerolast {

	public static void main(String[] args) {
		int [] a= {9,1,0,4,0,9,6};
		for(int i=0;i<a.length;i++)
		{
			if( a[i]==0) {
			for(int j=i+1;j<a.length;j++)
			{
			if(a[j]!=0)
			{
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
				break;
			}
		}
	}
		}
		for(int k:a)
		{
			System.out.println(k);
		}


}
}
