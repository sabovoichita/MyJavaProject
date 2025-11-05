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

//public class Main{
//	public static void main(String[] args) {
//		char myGrade = 'B';
//		//Display ASCII values
//		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//		//Strings
//		String greeting = "Hello World";
//		
//		System.out.println(myGrade);
//		System.out.println(myVar1);
//		System.out.println(myVar2);
//		System.out.println(myVar3);
//		System.out.println(greeting);
//	}
//}

//public class Main{
//	public static void main(String[] args) {
//		// Create variables of different data types
//		int items = 50;
//		float costPerItem = 9.99f;
//		float totalCost = items * costPerItem;
//		char currency = '$';
//		
//		//Print variables
//		System.out.println("Number of items: " + items);
//		System.out.println("Cost oer item: " + costPerItem + currency);
//		System.out.println("Total cost= "+ totalCost + currency);
//	}
//}

//Java var
//import java.util.ArrayList;
//public class Main{ 
//	public static void main(String[] args) {
//		var x = 5; // x is and int
//		var myNum = 5; //int
//		var myDouble = 9.98; //double
//		var myChar = 'D'; //char
//		var myBoolean = true; //Boolean
//		var myString = "Hello"; //String
//		//without var
////		ArrayList<String> cars = new ArrayList<String>();
//		//with var
//		var cars = new ArrayList<String>();
//		cars.add("Volvo");
//		cars.add("BMW");
//		cars.add("Ford");
//		cars.add("Mazda");
//		
//		System.out.println(x);
//		System.out.println(myNum);
//		System.out.println(myDouble);
//		System.out.println(myChar);
//		System.out.println(myBoolean);
//		System.out.println(myString);
//		System.out.println(cars);
//	}
//}

//Java Type Casting
//public class Main{
//	public static void main(String[] args) {
////		Widening Casting (automatic) - converting a smaller type to a larger type size
////		byte -> short -> char -> int -> long -> float -> double
//		int myInt = 9;
//		double myDouble = myInt; // Automatic casting: int to double
////		Narrowing Casting (manual) - converting a larger type to a smaller type size
////		double -> float -> long -> int -> char -> short -> byte
//		double myDouble1 = 9.78d;
//		int myInt1 = (int) myDouble1; //Manual casting: double to int
//		
//		System.out.println(myInt); // 0
//		System.out.println(myDouble); //Outputs 9.0
//		
//		System.out.println(myDouble1); //9.78
//		System.out.println(myInt1); //9
//
//		
//	}
//}

//Calculate the percentage of a user's score in relation to the maximum score in a game
//public class Main{
//	public static void main(String[] args) {
//		//Set the maximum possible score in the game to 500
//		int maxScore = 500;
//		
//		//The actual score of the user
//		int userScore = 423;
//		/*Calculate the percentage of the user's score in relation to the maximum
//		 * available score.
//		 * Convert userScore to double to make sure that the division is accurate*/
//		double percentage = (double) userScore / maxScore * 100.0d;
//		
//		System.out.println("User's percentage is: " + percentage + "%");
//	}
//}

//Java Operators
//public class Main{
//	public static void main(String[] args) {
//		int a = 100 + 50;
//		int sum1 = 100 + 50;
//		int sum2 = sum1 + 250;
//		int sum3 = sum2 + sum2;
//		int x = 10;
//		int y = 3;
//		int z = 5;
//		z++;
//		int a1 = 10;
//		int b1 = 3;
//		
//		double c = 10.0d;
//		double d = 3.0d;
//		
//		int x1 = 5;
//		++x1; //Increment x1 by 1
//		
//		int x2 = 5;
//		--x2; //Decrement x2 by 1
//		
//		
//		System.out.println("a: " + a);
//		System.out.println("sum1: " + sum1);
//		System.out.println("sum2: " + sum2);
//		System.out.println("sum3: " + sum3);
//		System.out.println("x: " + x);
//		System.out.println("y: "+ y);
//		System.out.println("x + y: " + (x + y)); //13
//		System.out.println("x - y: "+ (x - y)); //7
//		System.out.println("x * y: " + (x * y)); //30;
//		System.out.println("x / y: "+ (x / y));//3
//		System.out.println("x % y: " + (x % y)); //1
//		System.out.println("z: " + z); //6
//		--z;
//		System.out.println("z: " + z); //5
//		System.out.println("a1: " + a1);
//		System.out.println("b1: " + b1);
//		System.out.println("a1 / b1: "+ (a1 / b1));
//		System.out.println("c / d: "+ (x / d));
//		System.out.println("x1: " + x1); //6
//		System.out.println("x2: "+ x2);//4
//		++x2;
//		System.out.println("x2: "+ x2);// x2 becomes 5 again
//	}
//}

//Counting people
//public class Main{
//	public static void main(String[] args) {
//		int peopleInRoom = 0;
//		
//		System.out.println("people in room: "+ peopleInRoom); //0
//		// 3 people enter
//		peopleInRoom++;
//		peopleInRoom++;
//		peopleInRoom++;
//		
//		System.out.println("3 people enter: "+ peopleInRoom); //3
//		
//		// 1 person leaves
//		peopleInRoom--;
//		
//		System.out.println("1 person leaves: "+ peopleInRoom);//2
//		
//	}
//}

//Assignment Operators
//public class Main{
//	public static void main(String[] args) {
//		int x = 5;
//		System.out.println("x: " + x); //5
//		x += 3;
//		System.out.println("x += 3: "+ x);//8
//		x -= 3;
//		System.out.println("x -= 3: " + x); //5
//		x *= 3; 
//		System.out.println("x */ 3: " + x); //15
//		x /= 3;
//		System.out.println("x /= 3: " + x); //5
//		x = 5;
//		x %= 3;
//		System.out.println("x %= 3: " + x); //2
//		x = 5;
//		x &= 3;
//		System.out.println("x &= 3: " + x); //1
//		x = 5;
//		x |= 3;
//		System.out.println("x |= 3: " + x); //7
//		x = 5;
//		x ^= 3;
//		System.out.println("x ^= 3: " + x); //6
//		x = 5;
//		x >>= 3;
//		System.out.println("x >>= 3: " + x); //0
//		x = 5;
//		x <<= 3;
//		System.out.println("x <<= 3: " + x); //40
//		
//		
//	}
//}

//Tracking Savings
//public class Main{
//	public static void main(String[] args) {
//		int savings = 100;
//		savings += 50; //add 50 to savings
//		System.out.println("Total savings: " + savings); //150
//	}
//}

//Java Comparison Operators
//public class Main{
//	public static void main(String[] args) {
//		int x = 5;
//		int y = 3;
//		System.out.println("x: " + x);
//		System.out.println("y: "+y);
//		System.out.println("x > y => "+(x > y)); //returns true
//		System.out.println("x < y => "+(x < y)); //returns false
//		System.out.println("x == y => "+(x == y)); //returns false
//		System.out.println("x != y => "+(x != y)); //returns true
//		System.out.println("x >= y => "+(x >= y)); //returns true
//		System.out.println("x <= y => "+(x <= y)); //returns false
//	}
//}

//Check voting age
//public class Main {
//	public static void main(String[] args) {
//		int age = 18;
//		
//		System.out.println("age: "+ age);
//		System.out.println("age >= 18 ? "+ (age>=18)); //true, old enough to vote
//		System.out.println("age < 18 ? " +(age < 18)); //false, not old enough
//	}
//}

//Check if password is long enough
//public class Main {
//	public static void main(String[] args) {
//		int passwordLength = 5;
//		
//		System.out.println("password length: "+ passwordLength);
//		System.out.println("password length >= 8 ? "+ (passwordLength >= 8));
//		System.out.println("password length < 8 ? " + (passwordLength < 8));
//	}
//}

//Java Logical Operators
//public class Main {
//	public static void main(String[] args) {
//		int x = 5;
//		
//		System.out.println("x = "+ x);
//		System.out.println("x > 3 && x < 10 => " + (x > 3 && x < 10)); //true
//		System.out.println("x > 3 || x < 4 => " + (x > 3 || x < 4)); //true
//		System.out.println("!(x > 3 && x < 10) => " + !(x > 3 && x < 10)); //false - result reversed
//	}
//}

//Login Check
//public class Main{
//	public static void main(String[] args) {
//		boolean isLoggedIn = true;
//		boolean isAdmin = false;
//		
//		System.out.println("isLoggedIn ? => " + isLoggedIn);
//		System.out.println("isAdmin ? => " + isAdmin);
//		System.out.println("Regular user: => " + (isLoggedIn && !isAdmin)); //true
//		System.out.println("Has access: => " + (isLoggedIn || isAdmin)) ; //true
//		System.out.println("Not logged in: => " + (!isLoggedIn)); //false
//	}
//}

//Java Operator Precedence
//public class Main {
//	public static void main(String[] args) {
//	int result1 = 2 + 3 * 4; // 2 + 12 = 14
//	int result2 = (2 + 3) *4; // 5 * 4 = 20
//	int result3 = 10 - 2 + 5; // (10 - 2) + 5 = 13
//	int result4 = 10 - (2 + 5); // 10 - 7 = 3
//	
//	System.out.println("int result1 = 2 + 3 * 4 => " + result1);
//	System.out.println("int result2 = (2 + 3) * 4 => " + result2);
//	System.out.println("int result3 = 10 - 2 + 5 => " + result3);
//	System.out.println("int result3 = 10 - (2 + 5) => " + result4);
//	}
//}

//Java Strings
//public class Main{
//	public static void main(String[] args) {
//		String greeting = "Hello";
//		System.out.println("greeting: => "+greeting);
//		
////String length
//		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println("Stringtxt = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ' => "+txt );
//		System.out.println("The length of the txt string is: => " + txt.length());
//		
////The toUpperCase() method converts a string to upper case letters.
////The toLowerCase() method converts a string to lower case letters.
//		String txt1 = "Hello World";
//		System.out.println("txt1 = 'Hello World' => " + txt1);
//		System.out.println("txt1 to uppper case: => " + txt.toUpperCase());
//		System.out.println("txt1 to lower case: => " + txt.toLowerCase());
//		
////Finding a Character in a String- returns the index (the position) of the first occurrence
//		String txt2 = "Please locate where 'locate' occurs!";
//		System.out.println("txt2: => " + txt2);
//		System.out.println("txt.locate('locate') => "+ txt2
//				.indexOf("locate")); //7
////Access a character at a specific position in a string
//		String txt3 = "Hello";
//		System.out.println("txt3: => " + txt3);
//		System.out.println("txt3.charAt(0) => "+txt3.charAt(0)); //H
//		System.out.println("txt3.charAt(4) => "+txt3.charAt(4)); //o
//		
////Comparing Strings
//		String txt4 = "Hello";
//		String txt5 = "Hello";
//		String txt6 = "Greetings";
//		String txt7 = "Great things";
//		System.out.println("txt4 ='Hello'; txt5 = 'Hello'; txt4 = txt5 => " + txt4.equals(txt5));
//		System.out.println("txt6 = 'Greetings'; txt7 = 'Great things'; txt6 = txt7 => " + txt6.equals(txt7));
////Removing Whitespace
//		String txt8 = "    HelloWorld";
//		System.out.println("Before trimming: [" + txt8 + "]");
//		System.out.println("After trimming: [" + txt8.trim() + "]");
//	}
//}

//Java String Concatenation
public class Main{
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		System.out.println(firstName + " " + lastName);
//Concatenation in Sentences
		String name = "John";
		int age = 25;
		System.out.println("name: => " + name);
		System.out.println("age: => " + age);
		System.out.println("My name is "+ name + " and I am " + age + " years old." );
//The concat() Method
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName1.concat(lastName1));
		
		String a = "Java ";
		String b = "is ";
		String c = "fun!";
		String result = a.concat(b).concat(c);
		System.out.println("a = 'Java ' => " + a);
		System.out.println("b = 'is ' => " + b);
		System.out.println("c = 'fun! => " + c);
		System.out.println("Result = a.concat(b).concat(c); => "+ result);

	}
}