package NewProblems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Coolleecctionss {

	public static void main(String[] args) {
//		ArrayList a=new ArrayList();
//		a.add("a");
//		a.add("b");
//		a.add("c");
//		a.add("d");
		
//		a.add(0, "f");
//		a.remove(1);
//		a.set(1, "e");
//		a.get(1);
//		a.indexOf(1);
//		Object n=a.get(1);
//		System.out.println(n);
//		System.out.println(a.subList(1, 3));
//		a.indexOf(1);
		
//		Iterator itr=a.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println((itr.next()));
//		}
//		
		
//		for(int i=0;i<a.length;i++)
//		{
//			
//		}

//		LinkedList c1=new LinkedList();
//		c1.add(30);
//		c1.add(50);
//		c1.add(40);
//		
//		Object[] a=c1.toArray();
//		System.out.println(Arrays.toString(a));
		
//		for(Object o:a)
//		{
//			System.out.println(o);
//		}
		
		
//		Set s=new TreeSet();
//		System.out.println(s.add("sql"));
//		System.out.println(s.add("java"));
//		System.out.println(s.add("python"));
//		System.out.println(s.add("c"));
//		System.out.println(s.add("c++"));
//		System.out.println(s.add("java"));
//		for(Object o:s)
//		{
//			System.out.println(o);
//		}
		
//		Set h=new HashSet();
//		System.out.println(h.add("java"));
//		System.out.println(h.add("java"));
//		System.out.println(h.add("python"));
//		System.out.println(h.add("python"));
//		System.out.println(h.size());
//		for(Object o:h)
//		{
//			System.out.println(o);
//		}
		
		Deque q=new ArrayDeque();
		q.add(40);
		q.add(10);
		q.add(20);
		q.add(50);
		q.addFirst(00);
		q.addLast(155);
//		q.pollFirst();
//		q.peekFirst();
//		q.peekLast();
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}		
//		System.out.println(q.pollFirst());
//		System.out.println(q.pollLast());
		
}}