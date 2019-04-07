package myJavaProject;

class TestStatic1 {

	public String name;
	public static String staticName;

	public static int count;
	public int id;

	TestStatic1() {
		count++;
		id = count;
	}

	void printName1() {
		System.out.println("Static Name is : " + staticName + "   " + "ID is : " + id);
		System.out.println("Name is : " + name);
		// non-static class can access both static and non-static variable
	}

	static void printName() {
		System.out.println("Static Name is : " + staticName);
		// System.out.println("Name is : " + name); cannot refer to a non-static
		// variable in a static method
	}

}

public class StaticCounter {

	public static void main(String[] args) {

		TestStatic1.staticName = "Smith";
		TestStatic1.printName();

		System.out.println("Before calling object " + TestStatic1.count);
		TestStatic1 one = new TestStatic1();
		one.name = "Steve";
		one.printName1();
		System.out.println("After calling object " + TestStatic1.count);

		System.out.println("Before calling object " + TestStatic1.count);
		TestStatic1 two = new TestStatic1();
		two.name = "Steve2";
		two.printName1();
		System.out.println("After calling object " + TestStatic1.count);
	}

}
