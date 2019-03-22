package myJavaProject;

import java.util.Scanner;

public class SwitchCaseDefault {

	public static void main(String[] args) {
		System.out.println("Enter age:");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		switch (age) {
		case 10:
			System.out.println("You are young");
			break;
		case 20:
			System.out.println("Past Teen");
			break;
		default:
			System.out.println("Getting older");
			break;
		}
	}

}
