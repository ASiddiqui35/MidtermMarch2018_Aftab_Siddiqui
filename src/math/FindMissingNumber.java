package math;

 /* Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int a = FindMissingNumber.missingToatal(array);
        int b = FindMissingNumber.acctualToatal(10);
        int c = b-a;
        System.out.println(c);
    }
    public static int acctualToatal(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    public static int missingToatal(int []a){
        int missingtoatal = 0;
        for (int i = 0; i < a.length; i++){
            missingtoatal += a[i];
            }
            return missingtoatal;
    }
    }

