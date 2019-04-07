package myJavaProject;

class TestStatic {
	public static final int LUCKY_NUMBER = 3;
	public String name;
	public static String staticName;

	void printName1() {
		System.out.println("Static Name is : " + staticName);
		System.out.println("Name is : " + name);
		// non-static class can access both static and non-static variable
	}

	static void printName() {
		System.out.println("Static Name is : " + staticName);
		// System.out.println("Name is : " + name); cannot refer to a non-static
		// variable in a static method
	}

}

public class StaticAndFinal {

	public static void main(String[] args) {

		TestStatic.staticName = "Smith";
		TestStatic.printName();

		TestStatic one = new TestStatic();
		one.name = "Steve";
		one.printName1();

		System.out.println("Lucky Number is : " + TestStatic.LUCKY_NUMBER);

	}

}
