package datastructure;

import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		String path = "/Users/aftabsiddiqui/MidtemMarch2018/src/data/self-driving-car";
		List<String> list = new ArrayList<>();
		//ConnectDB connectDB = new ConnectDB();
		//connectDB.insertDataFromArrayListToMySql(list,"text","Strings");
		FileReader fr= null;
		BufferedReader br = null;

		try {
			 fr = new FileReader(path);
			 br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			System.out.println("Check File Path.");
		}
		try {
			if (fr != null) {
				br = new BufferedReader(fr);
				String st = "";

				while ((st = br.readLine()) != null) {
					list.add(st);
					//for (String x: list) {
					String a[] = st.split(" ");
					for (String txt : a) {
						System.out.println(txt);
						Stack<String> stack = new Stack<>();
						for (int i = 0; i < args.length; i++) {
							stack.add(a[i]);
							stack.peek();
							stack.pop();
							stack.push("TESLA");//should be at the end of the list
							for (String words : stack) {
								System.out.println(words);
							}
						}
					}
				}
			}
		}
		catch (Exception ex){
				ex.printStackTrace();
				}
            finally{
					if(fr != null){
			try{
				fr.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		if(br != null){
		try{
				br.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	}

}
