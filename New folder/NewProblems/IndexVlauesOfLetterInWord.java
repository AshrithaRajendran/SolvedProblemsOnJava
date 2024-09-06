package NewProblems;

import java.util.HashMap;
import java.util.Map;

public class IndexVlauesOfLetterInWord {

	public static void main(String[] args)
	{
		String s="banana";
		Map m=new HashMap();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!m.containsKey(c))
			{
				m.put(c,i+"");
			}
			else
			{
				String v=(String)m.get(c);
				v=v+","+i;
				m.put(c, v);
			}
		}
		System.out.println(m);
		

	}

}
