package NewProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		String s1="aabbbbaa";
//		char[] a=s1.toCharArray();
//		String s2="";
//	      int i=0;
//		while(i<a.length)
//		{
//			char c=a[i];
//			int count=1;
//			i++;
//			while(i<a.length && c==a[i])
//			{
//				count++;
//				i++;
//			}
//			s2=s2+c+count;
//		}
//		System.out.println(s2);
//		
//		
		
//		for(int i=0;i<a.length;i++)
//		{
//			char c=s1.charAt(i);
//			int count=1;
//			i++;
//			while(i<a.length && c==a[i])
//				{
//					count++;
//					i++;
//				}
//				s2=s2+c+count;
//			}
//			System.out.println(s2);
//		}
		
		
		String s1 = "aabbbbbbaaccc";
        char[] a = s1.toCharArray();
        String s2 = "";

        for (int i = 0; i < a.length;i++) {
            char c = a[i];
            int count = 1;
            
            while (i < a.length && c == a[i]) {
                count++;
                i++;
            }
            s2 = s2 + c + count;
        }

        System.out.println(s2);
	
	}

}