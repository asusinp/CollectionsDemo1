/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author iaw21752927
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Zulu");
		list.add("Alpha");
		list.add("Delta");
		list.add("Echo");
		list.add("Charlie");
		list.add("Bravo");
			
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		list.remove("Charlie");
		
	}

}
