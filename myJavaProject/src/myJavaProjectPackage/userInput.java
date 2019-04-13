package myJavaProject;

import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {

		System.out.println("Enter an integer");

		Scanner in1 = new Scanner(System.in);

		if (in1.hasNextInt()) {
			int input = in1.nextInt();

			System.out.println(input);

		} else {
			System.out.println("Please enter a valid integer");
		}
	}
}
