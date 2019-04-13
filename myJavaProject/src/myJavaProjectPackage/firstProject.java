
package myJavaProject;

public class firstProject {

	// Static - same value accessible from each instance of the class
	// Final - Value cannot be changed

	static final double PI = 3.14;
	// static int int2 = 5;

	public static void main(String[] args) {
		// int firstInt = 20;
		// int secondInt = 10;
		// secondInt += firstInt;
		// float bigValue = Float.MAX_VALUE;
		// double doubleValue = Double.MAX_VALUE;
		// int s = Integer.MAX_VALUE;

		// System.out.println(firstInt);
		// System.out.println(secondInt);
		// System.out.println(PI);
		// System.out.println(bigValue);
		// System.out.println(doubleValue);
		// System.out.println(s);
		int int2 = 7;
		int int3 = 2;
		System.out.println(second(int3));
	}

	// void - doesn't take in any value
	// takes in int and returns boolean
	public static boolean second(int int9) {

		// System.out.println(PI);
		System.out.println(int9);
		int9 += 1;
		System.out.println(int9);
		if (int9 > 5) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}

	}

	public static boolean second(int int2, int int3) {
		//
		if (int2 + int3 > 10) {
			return true;
		} else {
			return false;
		}
	}

}

//This was a later addition. dont look at it as part of FirstProject

class Try {
	void tryThis() {
		System.out.println("Try this out!!");
	}
}
