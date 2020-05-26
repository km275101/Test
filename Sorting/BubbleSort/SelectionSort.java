package BubbleSort;

import java.util.Arrays;

public class SelectionSort {
	
	static void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                {
                	min_idx = j; 
                }
  
            int temp = arr[i]; 
            arr[i] = arr[min_idx]; 
            arr[min_idx] = temp; 
        } 
    } 
  
    // Prints the array 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    static void selectionSort(int arr[]) {
    	int size = arr.length;
    	int min ;
    	for(int i =0 ; i<size; i++) {
    		min = i;
    		for(int j =i+1; j<size; j++) {
    			if(arr[min] > arr[j]) {
    				min = j;
    			}
    		}
    		int temp = arr[i];
    		arr[i] = arr[min];
    		arr[min] = temp;
     	}
    	
    	
    }
	

    static void selectionSort1(int arr[], int x) {
    	int count = 0;
    	int size = arr.length;
    	int min ;
    	for(int i =0 ; i<size; i++) {
    		if(x == count) {
    			printArray(arr);
    		}
    		count++;
    		min = i;
    		for(int j =i+1; j<size; j++) {
    			if(arr[min] > arr[j]) {
    				min = j;
    			}
    		}
    		int temp = arr[i];
    		arr[i] = arr[min];
    		arr[min] = temp;
     	}
    	
    	
    }
	
    public static void main(String[] args) {
		
		int arr[] = {64,25,12,22,11}; 
        //sort(arr); 
		selectionSort1(arr,5);
		
        System.out.println("Sorted array"); 
        printArray(arr); 
	}

}
