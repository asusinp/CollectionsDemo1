/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author iaw21752927
 *
 */
public class Main {
	
	public static List<String> subLlista(List<String> list, String str) {
		List<String> search = new LinkedList<>();
		for (String string : list) {
			if (string.matches(str + ".*")) {
				search.add(string);
			}
		}
		return search;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		List<String> sublist;
		
		list.add("Zulu");
		list.add("Alpha");
		list.add("Delta");
		list.add("Echo");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Alhaurín");
		list.add("Albacete");
//			
//		Collections.sort(list);
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
//		list.remove("Charlie");
		
		sublist = Main.subLlista(list, "Al");
		for (String string : sublist) {
			System.out.println(string);
		}
		
	}

}
