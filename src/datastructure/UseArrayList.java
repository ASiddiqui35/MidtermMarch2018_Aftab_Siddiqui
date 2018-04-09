package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		List<Integer> list = new ArrayList<Integer>();
		Random rdm = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rdm.nextInt(100));
		}
		List<Integer> sortedList = insertionSort((ArrayList<Integer>) list);
		Iterator it = sortedList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ConnectDB connectDB = new ConnectDB();
		//connectDB.insertDataFromArrayListToMySql(sortedList,"SortedArrayList","RandomNumber");
		}
		public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
		int i, j, key, temp;
		for (i = 1; i < list.size(); i++) {
			key = list.get(i);
			j = i - 1;
			while (j >= 0 && key < list.get(j)) {
				temp = list.get(j);
				list.set(j, list.get(j + 1));
				list.set(j + 1, temp);
				j--;
			}
		}return list;
	}
}




