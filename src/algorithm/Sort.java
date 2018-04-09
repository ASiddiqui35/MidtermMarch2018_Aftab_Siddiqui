//package algorithm;

//public class Sort {

   // long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


   /* public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < array.length; i++) {
            int k = array[i];
            int j = i - 1;
            while (j >= 0 && k < array[j]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public void mergeSort(int[] array, int lowIndex, int highIndex) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here   ///the alogorith was written with lost and losts of help of other codes available online.
        if (lowIndex == highIndex)
            return;
        else {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(array, lowIndex, highIndex);
            mergeSort(array, midIndex + 1, highIndex);
            merge(array, lowIndex, midIndex, highIndex);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

    }

    public void merge(int[] array, int lowIndex, int midIndex, int highIndex) {
        int[] L = new int[midIndex - lowIndex + 2];
        for (int i = lowIndex; i <= midIndex; i++) {
            L[i - lowIndex] = array[i];
        }
        L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
        int[] R = new int[highIndex - midIndex + 1];
        for (int i = midIndex; i <= highIndex; i++) {
            R[i - midIndex - 1] = array[i];
        }
        R[highIndex - midIndex] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = lowIndex; k <= highIndex; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
    }

    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }*/

  /*  public  int[] heapSort(int[] array) {
        int[] list = array;
        //implement here
        buildheap(array);
        int sizeOfHeap=array.length-1;
        for(int i=sizeOfHeap; i>0; i--) {
            exchange(array,0, i);
            sizeOfHeap=sizeOfHeap-1;
            heapify(array, 0,sizeOfHeap);
        }return list;

    public  void heapify(int[] array, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if (left <= size && array[left] > array[i]) {
            max = left;
        } else {
            max = i;
        }

        if (right <= size && array[right] > array[max]) {
            max = right;
        }

        if (max != i) {
            exchange(array, i, max);
            heapify(array, max, size);
        }
    }

    public  void buildheap(int [] array) {

        for (i = (array.length - 1) / 2; i >= 0; i--) {
            heapify(array, i, array.length - 1);
        }
    }

    public  void heapify(int[] array, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if (left <= size && array[left] > array[i]) {
            max = left;
        } else {
            max = i;
        }

        if (right <= size && array[right] > array[max]) {
            max = right;
        }
        if (max != i) {
            exchange(array, i, max);
            heapify(array, max, size);
        }
    }

    public  void exchange(int[] array,int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }


    public int [] bucketSort(int [] array, int maxVal) {
        int[] list = array;
        //implement here
        int[] bucket = new int[maxVal + 1];
        for ( i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }
        for ( i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long startTime = System.currentTimeMillis();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    
    public int [] shellSort(int [] array){
            int[] list = array;
            //implement here
        }
            public static int sort(int array[]){
                int n = array.length;
            }

                // Start with a big gap, then reduce the gap
                for (int gap = n/2; gap > 0; gap /= 2)
                {
                    // Do a gapped insertion sort for this gap size.
                    // The first gap elements a[0..gap-1] are already
                    // in gapped order keep adding one more element
                    // until the entire array is gap sorted
                    for (int i = gap; i < n; i += 1)
                    {
                        // add a[i] to the elements that have been gap
                        // sorted save a[i] in temp and make a hole at
                        // position i
                        int temp = arr[i];

                        // shift earlier gap-sorted elements up until
                        // the correct location for a[i] is found
                        int j;
                        for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                            arr[j] = arr[j - gap];

                        // put temp (the original a[i]) in its correct
                        // location
                        arr[j] = temp;
                    }
                }
            return 0;
            }

        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
*/