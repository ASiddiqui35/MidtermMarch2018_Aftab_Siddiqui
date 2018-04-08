package math;
import databases.ConnectDB;
import com.mysql.jdbc.util.*;
import java.util.List;
import java.util.ArrayList;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
	int a = LowestNumber.lowestNumber(array);
		System.out.println(a);
		ConnectDB connectDB = new ConnectDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectDB.insertDataFromArrayToMySql(array, "tbl_lowestNumber", "number");
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "number");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}


	//find lowest number from the array
	public static int lowestNumber(int a[]) {
		int min = a[0];

		for (int i = 1; i < a.length; i++){
			if (a[i] < min) {
				min = a[i];
			}
		}return min;
	}
}





