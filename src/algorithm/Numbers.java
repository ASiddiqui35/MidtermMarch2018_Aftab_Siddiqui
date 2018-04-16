package algorithm;

import databases.ConnectDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */


	public static void main(String[] args) throws Exception {

		int[] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
		List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n = num.length;
		randomize(num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "insertion_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbers);
		//By following above, Continue for rest of the Sorting Algorithm....
		n = num.length;
		randomize(num, n);
		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bubbleSort take: " + bubbleSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bubble_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize(num, n);
		//MergeSort
		algo.mergeSort(num, 0, num.length - 1);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in mergeSort take: " + mergeSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "merge_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize(num, n);
		//QuickSort
//	  algo.quickSort(num,0,num.length-1);
//	  long quickSortExecutionTime = algo.executionTime;
//	  System.out.println("Total Execution Time of " + num.length + " numbers in quickSort take: " + quickSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "quick_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize(num, n);
		//HeapSort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in heapSort take: " + heapSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "heap_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize(num, n);
		//BucketSort
		algo.bucketSort(num, 1000);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bucketSort take: " + bucketSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bucket_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("bucket_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize(num, n);
		//ShellSort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shellSort take: " + shellSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "shell_sort", "SortingNumbers");
		numbers = connectDB.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbers);

		//Come to conclusion about which Sorting Algo is better in given data set.
//	  /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=61468:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/tools.jar:/Users/aftabsiddiqui/MidtemMarch2018/out/production/CodingExamMarch2018:/Users/aftabsiddiqui/MidtemMarch2018/lib/mysql-connector-java-5.1.41-bin.jar:/Users/aftabsiddiqui/MidtemMarch2018/lib/mongo-java-driver-3.4.0.jar:/Users/aftabsiddiqui/MidtemMarch2018/driver/mysql-connector-java-6.0.6-bin.jar:/Users/aftabsiddiqui/MidtemMarch2018/lib/testng-6.8.5.jar algorithm.Numbers
//	  Total Execution Time of 1000000 numbers in Selection Sort take: 625741 milli sec
//	  Total Execution Time of 1000000 numbers in Insertion Sort take: 510946 milli sec
//	  Total Execution Time of 1000000 numbers in bubbleSort take: 2349575 milli sec
//	  Total Execution Time of 1000000 numbers in mergeSort take: 399 milli sec
//	  Total Execution Time of 1000000 numbers in heapSort take: 203 milli sec
//	  Total Execution Time of 1000000 numbers in bucketSort take: 8 milli sec
//	  Total Execution Time of 1000000 numbers in shellSort take: 135 milli sec
// IT IS CLEAR THAT BUCKET SORT IS THE BEST OUT OF ALL THE SORTING IN THIS CASE AND SHELL AND HEAP TAKES THE 2ND AND 3RD SPOT.
	}


	public static void storeRandomNumbers(int[] num) {
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(100);
		}
	}

	public static void randomize(int arr[], int n) {
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void printValue(List<String> array) {
		for (String st : array) {
			System.out.println(st);
		}
	}
}
