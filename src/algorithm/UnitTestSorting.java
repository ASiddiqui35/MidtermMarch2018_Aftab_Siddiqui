package algorithm;

import org.testng.Assert;

public class UnitTestSorting {
    //This class is about Unit testing for Sorting Algorithm.
    public static void main(String[] args) {

        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] expecedSortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        int[] actualSoredArray = sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now do for rest of the algorithm...................below
//apply unsorted array to selectionSort.
        int[] actualSoredArray1 = sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray1, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //apply unsorted array to selectionSort.
        int[] actualSoredArray2 = sort.mergeSort(unSortedArray, 0, unSortedArray.length - 1);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray2, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        int[] actualSoredArray3 = sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray3, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        int[] actualSoredArray4 = sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray4, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        int[] actualSoredArray5 = sort.bucketSort(unSortedArray,1000);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray5, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        int[] actualSoredArray6 = sort.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expecedSortedArray, actualSoredArray6, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}



