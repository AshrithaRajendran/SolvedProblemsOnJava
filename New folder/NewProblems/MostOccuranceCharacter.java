package NewProblems;

public class MostOccuranceCharacter {

	public static void main(String[] args) {
		String s="abbbbcccee";
		char[] arr=s.toCharArray();
		int max=0;
//		char ch1=' ';
		char maxChar=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			int count=0;
			for(int j=1;j<arr.length;j++)
			{
				if(ch==arr[j])
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
//				ch1=ch;
				maxChar=arr[i];
			}
		}
		System.out.println(maxChar+"="+max);
	}
}
