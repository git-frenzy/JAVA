package lecture3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<String> list2 = new ArrayList<String>();
//		ArrayList<Boolean> list3 = new ArrayList<Boolean>();

		// add elements
		list.add(0);
		list.add(2);
		list.add(3);

		System.out.println(list);
				
//

		// get element (via index)
		int element = list.get(0);

		System.out.println(element);

//

		// add element in between
		list.add(1, 5); // --> list.add(index, element)
		System.out.println(list);

//

		// set element (replace element)
		list.set(0, -1); // --> list.set(index, element to be replaced)
		System.out.println(list);

//

		// delete element (via index)
		list.remove(3);
		System.out.println(list);

//		

		// size of array list
		int size = list.size();
		System.out.println(size);

//		

		// loops
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

//

		// sorting
		Collections.sort(list);
		System.out.println(list);

	}
}


