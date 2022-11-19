import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class OOD_2_1 {
	//1.1
	static int getPoints(String alienColour) {
		if (alienColour == "green") {
			return 5;
		} else if (alienColour == "red") {
			return 10;
		} else if (alienColour == "yellow") {
			return 15;
		} else {
			return 0;
		}
	}
	//1.2
	static long sumOfNumbersUpTo(int number) {
		long total = 0L;
		for(int i=1; i<=number; i++) {
			total += i;
		}
		return total;
	}
	//1.3
	static void displayTimesTable(int multiple) {
		for (int i = 1; i < 13; i++) {
			System.out.println(i+" x 3 = "+i*multiple);
		}
	}
	//2.1
	static boolean leapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			}
		} else {
			if (year % 4 == 0) {
				return true;
			}
		}
		return false;
	}
	//2.2
	static boolean arrayContains(String[] stringArray, String string) {
		if (stringArray.toString().contains(string)) {
			return true;
		} else {
			return false;
		}
	}
	//2.3
	static int arrayFrequency(int[] integerArray, int integer) {
		int count = 0;
		for (int i : integerArray) {
			if (i == integer) {
				count++;
			}
		}
		return count;
	}
	//2.4
	static int maxNumber(int[] integerArray) {
		int max = integerArray[0];
		for (int i : integerArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	//2.5
	static int[] extractEvenArray(int[] integerArray) {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		for (Integer integer : integerArray) {
			if (integer%2==0) {
				integerArrayList.add(integer);
			}
		}
		int[] newIntegerArray = new int[integerArrayList.size()];
		for (int i = 0; i < newIntegerArray.length; i++) {
			newIntegerArray[i] = integerArrayList.get(i);
		}
		return newIntegerArray;
	}
	//2.6
	static String[] reverseStringArray(String[] stringArray) {
		String[] newStringArray = new String[stringArray.length];
		for (int i = 0; i < newStringArray.length; i++) {
			newStringArray[i] = stringArray[stringArray.length-1-i];
		}
		return newStringArray;
	}
	//2.7
	static boolean isAnagram(String string1, String string2) {
		String[] string1Array = string1.split(",");
		String[] string2Array = string2.split(",");
		Arrays.sort(string1Array);
		Arrays.sort(string2Array);
		if (string1Array==string2Array) {
			return true;
		} else {
			return false;
		}
	}
	//2.8
	static Double medianNumber(Double[] doubleArray) {
		Double median = doubleArray[0];
		Arrays.sort(doubleArray);
		if (doubleArray.length%2==0) {
			median = (doubleArray[doubleArray.length/2] + doubleArray[doubleArray.length/2 + 1])/2;
		} else {
			median = doubleArray[(doubleArray.length+1)/2];
		}
		return median;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.1
		int points = getPoints("green");
		System.out.println("You’ve scored "+points+" points!");
		//1.2
		System.out.println(sumOfNumbersUpTo(5));
		//1.3
		displayTimesTable(5);
		//2.5
		int[] intArray = {2,5,3,7,6,7,3,4,3};
		System.out.println(Arrays.toString(extractEvenArray(intArray)));
	}

}
