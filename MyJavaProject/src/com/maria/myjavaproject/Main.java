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

public class Main{
	public static void main(String[] args) {
		final int myNum = 15;
		//myNum = 20;//Error; cannot assign a value to a final variable
		System.out.println(myNum);
		
		//Note: By convention, final variables in Java are usually written 
		//in upper case (e.g. BIRTHYEAR)
		final int MINUTES_PER_HOUR = 60;
		final int BIRTHYEAR = 1980;
		System.out.println(MINUTES_PER_HOUR);
		System.out.println(BIRTHYEAR);
	}
}