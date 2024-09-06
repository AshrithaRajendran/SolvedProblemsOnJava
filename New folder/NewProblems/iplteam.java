package NewProblems;



public class iplteam 
{
	public static void main(String[] args) {
		
		String[] iplteam= {"chennai super kings","royal challengers banglore","Rajasthan royals","sunrises Hyderabad"};
		String[] ans=new String[iplteam.length]	;
		String searchWord="ro";
		int count=0;
		for(int i=0;i<iplteam.length;i++)
		{
			String team=iplteam[i];
			String[] noOfWords=team.split(" ");	
			for(int j=0;j<noOfWords.length;j++)
			{
				if(noOfWords[j].indexOf(searchWord)==0) 
				{
					ans[count++]=team;
					break;
				}
			}
		}
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]!=null)
			{
				System.out.println(ans[i]);
			}
		}
		

	}

}
