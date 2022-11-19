import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class OOD_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.1
		String[] courses = {"UNIX","SQL","Java","Python","Web Apps"};
		for (String course : courses) {
			System.out.println("I love learning "+course);
		}
		//1.2
		ArrayList<String> coursesList = new ArrayList<String>();
		for (String course : courses) {
			coursesList.add(course);
		}
		//1.3
		for (String course : coursesList) {
			System.out.println("I love learning "+course);
		}
		//1.4
		ArrayList<Double> prices = new ArrayList<Double>();
		prices.add(4.50);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);
		Double totalPrice = 0.0;
		for (Double price : prices) {
			totalPrice += price;
		}
		System.out.println(totalPrice);
		//1.5
		Double[] priceArray = new Double[5];
		for (int i=0; i<priceArray.length; i++) {
			priceArray[i] = prices.get(i);
		}
		//1.6
		String string = "10,7,25,3,8";
		String[] numbers = string.split(",");
		int total = 0;
		for (String number : numbers) {
			total += Integer.parseInt(number);
		}
		System.out.println(total);
		//1.7
		string = "desrever neeb sah txet siht";
		char[] chars = string.toCharArray();
		String newString = "";
		for (char c : chars) {
			newString = c + newString;
		}
		System.out.println(newString);
		
		//2.1
		for(int i=1; i<=1000000; i++) {
			System.out.println(i);
		}
		//2.2
		long total1 = 0L;
		for(int i=1; i<=1000000; i++) {
			total1 += i;
		}
		//2.3
		for(int i=1; i<=20; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}
		}
		//2.4
		for (int i = 1; i < 13; i++) {
			System.out.println(i+" x 3 = "+i*3);
		}
		//2.5
		int[] integers = {25,15,99,75,47,59,82};
		for (int i = 0; i < integers.length; i++) {
			if (i%2==1) {
				integers[i]++;
			}
		}
		for (int i : integers) {
			System.out.println(i);
		}
		//2.6
		int i = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			if (i%2==1) {
				System.out.println(c);
			}
			i++;
		}
		//2.7
		for (int table = 2; table <=12; table++){
			System.out.println(table+" times table");
							
			for (int multiple = 1; multiple <=12; multiple++){
				int result = multiple * table;
				System.out.println(multiple+" x "+table+" = "+result);
			}
							
			System.out.println();
		}
		//3.1
		i = 1;
		while (i<=1000000) {
			System.out.println(i);
			i++;
		}
		//3.2
		char c = 'a';
		while (c <= 'z') {
			System.out.println(c);
			c++;
		}
		//3.3
		int firstNumber = 0;
		int secondNumber = 1;
		while(firstNumber < 1000) {
			System.out.println(firstNumber);
			if (secondNumber < 1000) {
				System.out.println(secondNumber);
			}
			firstNumber += secondNumber;
			secondNumber += firstNumber;
		}
		//4.1
		String[] cities = {"Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle"};
		for (String city : cities) {
			if (!city.startsWith("B")) {
				System.out.println(city+" – doesn’t match");
			} else {
				System.out.println(city+" - match");
				break;
			}
		}
		//4.2
		int[] numbers1 = {6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91};
		for (int num : numbers1) {
			if (num > 100) {
				System.out.println(num);
				break;
			}
		}
	}

}