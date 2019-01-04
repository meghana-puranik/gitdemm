package first;

import java.util.ArrayList;

public abstract class ArrayList_LinkendList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		
		String s1="htmlhtmlhtml";
		String[]  s2=s1.split(s1);
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		System.out.println("hi".compareTo(s1));
		System.out.println(al.contains(10));
		
	}

}
