package com.purna.codeDecode;

import java.util.Arrays;
import java.util.List;

public class SortingExample {

		public static void main(String[] args) {
	        // Sample list with duplicates
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 8, 4, 3, 5, 64, 77, 34, 3);
	        
	        System.out.println("Original List: " + numbers);

	        // Bubble Sort
	        List<Integer> bubbleSorted = bubbleSort(numbers);
	        System.out.println("Bubble Sorted: " + bubbleSorted);
	        
	        // Selection Sort
	        List<Integer> selectionSorted = selectionSort(numbers);
	        System.out.println("Selection Sorted: " + selectionSorted);
	        
	        // Insertion Sort
	        List<Integer> insertionSorted = insertionSort(numbers);
	        System.out.println("Insertion Sorted: " + insertionSorted);
	        
	        // Merge Sort
	        List<Integer> mergeSorted = mergeSort(numbers);
	        System.out.println("Merge Sorted: " + mergeSorted);
	        
	        // Quick Sort
	        List<Integer> quickSorted = quickSort(numbers);
	        System.out.println("Quick Sorted: " + quickSorted);
	    }
	    
	    // Bubble Sort
	    public static List<Integer> bubbleSort(List<Integer> numbers) {
	        Integer[] arr = numbers.toArray(new Integer[0]);
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        return Arrays.asList(arr);
	    }
	    
	    // Selection Sort
	    public static List<Integer> selectionSort(List<Integer> numbers) {
	        Integer[] arr = numbers.toArray(new Integer[0]);
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	        return Arrays.asList(arr);
	    }
	    
	    // Insertion Sort
	    public static List<Integer> insertionSort(List<Integer> numbers) {
	        Integer[] arr = numbers.toArray(new Integer[0]);
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	        return Arrays.asList(arr);
	    }
	    
	    // Merge Sort
	    public static List<Integer> mergeSort(List<Integer> numbers) {
	        Integer[] arr = numbers.toArray(new Integer[0]);
	        mergeSortHelper(arr, 0, arr.length - 1);
	        return Arrays.asList(arr);
	    }
	    
	    private static void mergeSortHelper(Integer[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;
	            mergeSortHelper(arr, left, mid);
	            mergeSortHelper(arr, mid + 1, right);
	            merge(arr, left, mid, right);
	        }
	    }
	    
	    private static void merge(Integer[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	        
	        Integer[] leftArr = new Integer[n1];
	        Integer[] rightArr = new Integer[n2];
	        
	        System.arraycopy(arr, left, leftArr, 0, n1);
	        System.arraycopy(arr, mid + 1, rightArr, 0, n2);
	        
	        int i = 0, j = 0, k = left;
	        while (i < n1 && j < n2) {
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i];
	                i++;
	            } else {
	                arr[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }
	        
	        while (i < n1) {
	            arr[k] = leftArr[i];
	            i++;
	            k++;
	        }
	        
	        while (j < n2) {
	            arr[k] = rightArr[j];
	            j++;
	            k++;
	        }
	    }
	    
	    // Quick Sort
	    public static List<Integer> quickSort(List<Integer> numbers) {
	        Integer[] arr = numbers.toArray(new Integer[0]);
	        quickSortHelper(arr, 0, arr.length - 1);
	        return Arrays.asList(arr);
	    }
	    
	    private static void quickSortHelper(Integer[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);
	            quickSortHelper(arr, low, pi - 1);
	            quickSortHelper(arr, pi + 1, high);
	        }
	    }
	    
	    private static int partition(Integer[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	    }

}
