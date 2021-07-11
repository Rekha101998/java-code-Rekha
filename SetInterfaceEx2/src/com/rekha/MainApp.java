package com.rekha;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		Set hash = new HashSet();
		

		hash.add("Rekha");
		hash.add("Rekha");
		hash.add("Kritika");
		hash.add("NEHA");
		hash.add("Neha");
		
		System.out.println("HashSet = " + hash);
		
		
      Set linkedhash = new LinkedHashSet();
		

		linkedhash.add("Rekha");
		linkedhash.add("Rekha");
		linkedhash.add("Kritika");
		linkedhash.add("NEHA");
		linkedhash.add("Neha");
		
		System.out.println("LinkedHashSet = " + linkedhash);
		
		Set tree = new TreeSet();
		tree.add("Rekha");
		tree.add("Rekha");
		tree.add("Kritika");
		tree.add("NEHA");
		tree.add("Neha");
		
		System.out.println("TreeSet = " + tree);

		
		
		
		
		
		

	}

}
