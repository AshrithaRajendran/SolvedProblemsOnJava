package NewProblems;

public class ReverseStringUsingSplit {

	public static void main(String[] args) {
		String s1="ashritha is a good girl";
		
		String[] s2=s1.split(" ");
		String s3=" ";
		
		for(int i=s2.length-1;i>=0;i--)
		{
			s3+=s2[i];
			if(i>0) s3+=" ";
			
		}
		System.out.println(s3.trim());

	}

}
