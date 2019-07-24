package com.map;

import java.util.*;


public class TestMap 
{
public static void main(String[] args)
{
	String s = "sdjghfjdgf";
	HashSet hs  = new HashSet();
	HashMap hm  = new HashMap();
	for(int i=0;i<s.length();i++) {
		hs.add(s.charAt(i));
	}
	char[] c= s.toCharArray();
	for(Object o:hs) {
		int count=0;
		char d =  (char)o;
		for(int i=0;i<c.length;i++)
		if(d==c[i])
			count++;
		hm.put(d,count);
	}
	System.out.println(hm);
	
}
}
