package com.fdmgroup.methodsAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {
	
	//1.1
	public static List<Integer> primeNumbers(int highestNumber) {
		List<Integer> primeNumbersList = new ArrayList<Integer>();
		if (highestNumber >= 2) {
			int i = 2;
			outer: while (i<=highestNumber) {
				if (primeNumbersList.size() == 0) {
					primeNumbersList.add(i);
				} else {
					for (Integer primeNumber : primeNumbersList) {
						if (i%primeNumber == 0) {
							i++;
							continue outer;
						}
					}
					primeNumbersList.add(i);
				}
				i++;
			}
		}
		return primeNumbersList;
	}
	
	//1.2
	public static int[] bubbleSort(int[] array) {
        int n = array.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		if(array[j-1] > array[j]){  
        			//swap elements  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }                           
            }  
         } 
		return array;
	}
	
	//1.3
	public static String simpleEncoder(String string){
		return null;
	}
	
	//1.4
	public static String encode(String text){
		return null;
	}
	
	//1.5
	public static int[] rotateArray(int[] array, int numberOfRotations) {
		
		return null;
	}
	
	//1.6
	public static int roverMove(int gridSize, String[] commands) {
		
		return 0;
	}
	
	//1.7
	public static boolean validPostcode(String postcode) {

		return false;
	}
	
	//1.8
	public static boolean validPassword(String password) {

		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(primeNumbers(50));
		int[] intArray = {3,2,1,4,5};
		System.out.println(Arrays.toString(bubbleSort(intArray)));
	}

}
