package datastructure;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

import java.util.LinkedList;


public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("Java");
		queue.add("Python");
		queue.add("Ruby");
		queue.add("C++");
		String fifo = queue.peek();
		//System.out.println("Java should be printed: " +fifo);
		String lilo = queue.remove();
		System.out.println("Java should be removed: " +lilo);
		for (String pl : queue) {
			//System.out.println(pl);
		}
		/*Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}
}
