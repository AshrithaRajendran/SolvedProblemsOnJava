package NewProblems;

public class MostOccuranceElement {

	public static void main(String[] args) {
		int[] arr= {1,6,7,2,2,6,6,6,9};
		int max=0;
		int maxCountElement=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}     if(count>max)
					{
						max=count;
						maxCountElement=arr[i];
					}
			}
		System.out.println(maxCountElement+"="+max);

	}
}
