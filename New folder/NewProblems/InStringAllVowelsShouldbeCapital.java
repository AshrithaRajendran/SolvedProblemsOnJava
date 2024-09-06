package NewProblems;

public class InStringAllVowelsShouldbeCapital {

	public static void main(String[] args) {
		String s="india is a great country";
		char[] s2=s.toCharArray();
	
		for(int i=0;i<=s2.length-1;i++)
		{
			char c=s2[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
					char n=(char)(c-32);
					System.out.print(n);
			}
			else
				{	
				System.out.print(c);	
			}
	}
		
	}

}
