package com.maria.myjavaproject;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
//}

//public class Main {
//	public static void main(String[]args) {
//		
//		System.out.println("Hello");
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		System.out.println("I am learning Java");
//		System.out.println("It is awesome!");
//	}
//}

/*public class Main{
	public static void main(String[] args) {
		System.out.print("Hello World! ");
		System.out.print("I will print on the same line.");
	}
}
 */

//This is a comment
//public class Main{
//	public static void main(String[] args) {
//		System.out.println(3);
//		System.out.println(358);
//		System.out.println(123456);
//		System.out.println(3 + 3);
//		System.out.println(2 * 6);
//		
//	}
//}
//
//public class Main{
//	public static void main(String[] args) {
//		String name = "Maria";
//		System.out.println(name);
//		
//		int myNum = 15;
//		System.out.println(myNum);
//		
//		int otherNum;
//		otherNum = 20;
//		System.out.println(otherNum);
//		
//		//Change the value of myNum from 15 to 25;
//		//int myNum=15;
//		myNum=20;
//		System.out.println(myNum);
//		
//		//final int myNum = 15; // will generate an error:
//		myNum=200;
//		System.out.println(myNum);
//		
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		String firstName = "Maria ";
//		String lastName = "Truscai";
//		String fullName = firstName + lastName;
//		System.out.println(fullName);
//		
//		int x = 5;
//		int y = 6;
//		System.out.println("The sum is " + x + y);
//		System.out.println("The sum is: " + (x + y));
//		
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		int x = 5, y = 6, z = 50;
//		System.out.println(x + y + z);
//		
//		int a, b, c;
//		a = b = c = 50;
//		System.out.println(a + b + c);
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		//Good
//		int minutesPerHour = 60;
//		
//		//OK, but so easy to understand what m actually is
//		int m = 60;
//		System.out.println(minutesPerHour);
//		System.out.println(m);
//		
//		// int2ndNumber=3; //Cannot start with a digit
//		// int my var = 10; //Cannot contain spaces
//		// int int = 30; //Cannot use reserved keywords
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		final int myNum = 15;
//		//myNum = 20;//Error; cannot assign a value to a final variable
//		System.out.println(myNum);
//		
//		//Note: By convention, final variables in Java are usually written 
//		//in upper case (e.g. BIRTHYEAR)
//		final int MINUTES_PER_HOUR = 60;
//		final int BIRTHYEAR = 1980;
//		System.out.println(MINUTES_PER_HOUR);
//		System.out.println(BIRTHYEAR);
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		//Student data
//		String studentName = "John Doe";
//		int studentID = 15;
//		int studentAge= 24;
//		float studentFee = 72.35f;
//		char studentGrade = 'B';
//		//Print variables
//		System.out.println("Student name: " + studentName);
//		System.out.println("Student ID: " + studentID);
//		System.out.println("Student age: "+ studentAge);
//		System.out.println("Student fee: " + studentFee);
//		System.out.println("Student grade: " + studentGrade);
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		// Calculate the area of a rectangle
//		// Create integer variables
//		int length = 4;
//		int width = 6;
//		int area;
//		 
//		//Calculate the are of a rectangle 
//		area = length + width;
//		
//		//Print variables
//		System.out.println("Length is: "+ length);
//		System.out.println("Width is: "+ width);
//		System.out.println("Area of the rectangle is: "+ area);
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		int myNum = 5; //integer(whole number)
//		float myFloatNum = 5.99f; //floating number
//		char myLetter = 'D'; //character
//		boolean myBool = true; //boolean
//		String myText = "Hello"; //String
//		
//		System.out.println(myNum);
//		System.out.println(myFloatNum);
//		System.out.println(myLetter);
//		System.out.println(myBool);
//		System.out.println(myText);
//		
//		int myNum1=5; //integer
////		myNum = "hello"; //Error: cannot assign a String to an integer
//		
//		String myText1 = "Hi"; //a String
////		myText = 123; //Error: cannot assign a number to a String
//		
//		System.out.println(myNum1);
//		System.out.println(myText1);
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		// byte
//		byte myNum = 100;
//		// short
//		short myNum1=5000;
//		// int from -2147483648 to 2147483647
//		int myNum2 = 10000;
//		// long from -9223372036854775808 to 9223372036854775807
//		long myNum3 = 150000000000L;
//		// float ends with f, is only 6-7 decimal digits
//		float myNum4 = 5.75f;
//		// double ends with d, about 16 digits.
//		double myNum5 = 10.99d;
//		//float e to indicate the power of 10
//		float f1 = 35e3f;
//		//double
//		double d1=12E4d;
//		
//		
//		System.out.println(myNum);
//		System.out.println(myNum1);
//		System.out.println(myNum2);
//		System.out.println(myNum3);
//		System.out.println(myNum4);
//		System.out.println(myNum5);
//		System.out.println(f1);
//		System.out.println(d1);
//		
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		boolean isJavaFun = true;
//		boolean isFishTasty = false;
//		System.out.println(isJavaFun);
//		System.out.println(isFishTasty);
//		
//	}
//}

public class Main{
	public static void main(String[] args) {
		char myGrade = 'B';
		//Display ASCII values
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		//Strings
		String greeting = "Hello World";
		
		System.out.println(myGrade);
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		System.out.println(greeting);
	}
}
