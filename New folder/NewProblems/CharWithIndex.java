package NewProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharWithIndex {

	public static void main(String[] args) {
		String s="java";
		Map<Character,String> m=new HashMap();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!m.containsKey(c))
			{
				m.put(c, i+"");
			}
			else
			{
				String value=(String) m.get(c);
				m.put(c, value+","+i);
			}
		}
		//Iterator i=m.keySet().iterator();
		Set s1=m.keySet();
		Iterator i=s1.iterator();
		
		while(i.hasNext())
		{
			Character c1=(Character) i.next();
			String v=(String) m.get(c1);
			System.out.println(c1+"-"+v);
		}
		
	}

}
