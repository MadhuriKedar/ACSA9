package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P9 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(78);
		System.out.println(l1);
		for(Integer b:l1) {
			System.out.println(b);
		}
		System.out.println("===========================");
		Set<String> s1 = new HashSet<String>();
		s1.add("dinga");
		s1.add("malinga");
		s1.add("laila");
		System.out.println(s1);
		for(String a:s1) {
			System.out.println(a);
		}
	}
}
