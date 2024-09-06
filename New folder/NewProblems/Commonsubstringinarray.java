package NewProblems;



public class Commonsubstringinarray 
{
	public static void main(String[] args)
	{
		String[] arr= {"ab","ab","abc"};
		System.out.println(LongCommonSubstring(arr));
	}
	public static String LongCommonSubstring(String[] arr)
	{
		String ans=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			while(arr[i].indexOf(ans)!=0)
			{
				ans=ans.substring(0,ans.length()-1);
			}
		}
		return ans;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


