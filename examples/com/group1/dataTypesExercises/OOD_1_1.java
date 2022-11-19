
public class OOD_1_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.1
		String message = "hello";
		System.out.println(message);
		//1.2
		String firstName = "Alex";
		String lastName = "Ng";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		//1.3
		String name = "Eric";
		System.out.println("Hello "+name+", would you like to learn some Java today?");
		//1.4
		String myName = "Alex Ng";
		System.out.println(myName.length());
		System.out.println(myName.toUpperCase());
		System.out.println(myName.charAt(0));
		System.out.println(myName.charAt(myName.length()-1));
		//1.5
		String sentence = "this is a sentence";
		System.out.println(sentence.indexOf(" "));
		System.out.println(sentence.lastIndexOf(" "));
		System.out.println(sentence.indexOf("x"));
		System.out.println(sentence.substring(0,4));
		System.out.println(sentence.substring(10));
		System.out.println(sentence.contains("a"));
		System.out.println(sentence.contains("x"));
		sentence = "is" + sentence+"?";
		sentence = sentence.replace("t", "T");
		System.out.println(sentence);
		
		//2.1
		int number = 99;
		System.out.println("My favourite number is "+number);
		//2.2
		int numberA=5;
		int numberB=3;
		System.out.println(numberA+numberB);
		//2.3
		int counter = 0;
		counter++;
		counter += 5;
		counter--;
		counter -= 2;
		counter *= 2;
		System.out.println(counter);
		//2.4
		int a = 5;
		int b = 2;
		double c = 5;
		double d = 2;
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(c/b);
		System.out.println(a/d);
		
		//3.1
		char letter = 'a';
		int code = 98;
		System.out.println((int)letter);
		System.out.println((char)code);
		System.out.println((char)36);
		//3.2
		System.out.println('c'-'a');
		System.out.println('z'-'a');
		//3.3
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		String string1 = "z";
		String string2 = "y";
		System.out.println(char1+char2+char3);
		System.out.println(char1+char2+string2);
		System.out.println(char1+string1+char3);
		
		//4.1
		String number1 = "5";
		String number2 = "3";
		System.out.println(Integer.parseInt(number1)+Integer.parseInt(number2));
		//4.2
		number1 = "5.3";
		number2 = "3.2";
		System.out.println(Double.parseDouble(number1)+Double.parseDouble(number2));
		//4.3
		string1 = "abc11";
		string2 = "9xyz";
		String string3 = "abc7xyz";
		int numberS1 = Integer.parseInt(string1.substring(3));
		int numberS2 = Integer.parseInt(string2.substring(0,1));
		int numberS3 = Integer.parseInt(string3.substring(3,4));
		System.out.println(numberS1+numberS2+numberS3);
	}

}

