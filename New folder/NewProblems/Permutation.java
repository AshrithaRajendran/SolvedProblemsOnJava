package NewProblems;

public class Permutation {
	public static void main(String[] args) {
		String s="abc";
	permutation(s,0,s.length()-1);
	}
	public static void permutation(String s,int start,int end)
	{
		if(start>=end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++)
		{
			String s1=swap(s,start,i);
			permutation(s1,start+1,end);			
		}
	}
	private static String swap(String s, int start, int i) {
		char[] arr=s.toCharArray();
		char temp=arr[start];
		arr[start]=arr[i];
		arr[i]=temp;
		return new String(arr);	
	}
}
