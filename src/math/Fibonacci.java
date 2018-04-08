package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */


        int prev = 1, b4next = 1, next;
        next = 0;
        List<Integer> list = new ArrayList<>();
        System.out.print("1 1 ");
        next = prev + b4next;
        while(next<=10) {
            next = prev + b4next;
            list.add(next);
            //System.out.print(next + " ");
            prev = b4next;
            b4next = next;
        }
        for (Integer in : list)
            System.out.println(in);
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(list, "mathFibonacci", "number");

}}
