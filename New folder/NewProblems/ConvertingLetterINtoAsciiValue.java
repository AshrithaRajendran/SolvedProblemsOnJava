package NewProblems;

public class ConvertingLetterINtoAsciiValue {

	public static void main(String[] args) 
	{
		String s="bcd";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int n=(int)c;
			s1=s1+n;
		}
		System.out.println(s1);
		
		

	}

}
