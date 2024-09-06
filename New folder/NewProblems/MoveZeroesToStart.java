package NewProblems;

public class MoveZeroesToStart {

	public static void main(String[] args) {
		int [] arr= {4,3,0,0,0,4,5,8};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				for(int j=i+1;j<arr.length;j++)	
				{
					if(arr[j]==0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
		for(int n:arr)
		{
		System.out.print(n);
		}
	}
}
