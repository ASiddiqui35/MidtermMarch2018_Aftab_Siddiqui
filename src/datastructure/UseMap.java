package datastructure;

import com.sun.xml.internal.xsom.impl.parser.DelayedRef;
import databases.ConnectDB;

import javax.lang.model.element.Element;
import javax.sound.midi.Soundbank;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<Character> numbers = new ArrayList<>();
		numbers.add('0');
		numbers.add('1');
		numbers.add('2');
		numbers.add('3');
		numbers.add('4');
		numbers.add('5');

		List<Character> charecters = new ArrayList<>();
		charecters.add('~');
		charecters.add('!');
		charecters.add('@');
		charecters.add('$');
		charecters.add('%');
		charecters.add('%');

		List<Character> alphabets = new ArrayList<>();
		for (char i = 'A'; i <= 'J'; i++) {
			alphabets.add(i);
		}
		/*for(Character c: alphabets){
			System.out.println(c);*/
		Map<String, List<Character>> map = new LinkedHashMap<>();
		map.put("Numbers", numbers);
		map.put("Charecters", charecters);
		map.put("Alphabets", alphabets);
		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());

			/*ConnectDB connectDB = new ConnectDB();
			connectDB.insertDataFromArrayListToMySql(numbers, "HashMap", "Charecters");
			try {
				connectDB.readDataBase("HashMap","Charecters");
			} catch (Exception e1) {
				e1.printStackTrace();
			}*/
		}

	}
}
