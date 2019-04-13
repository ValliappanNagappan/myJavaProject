package myJavaProject;

class Frog {
	private String name;
	private int age;

	public String setName(String name) {
		// this refers to the instance variable declared in the class. And doesn't refer
		// to the local variable.
		this.name = name;
		// System.out.println(name);
		return name;
	}

	// public String getName() {
	// return name;
	// }
}

public class SetterAndThis {

	public static void main(String[] args) {

		Frog sam = new Frog();
		String name1 = "sam";
		// sam.setName(name1);

		// sam.setName("Sam");
		System.out.println(sam.setName("Tom"));

		// System.out.println(name1);
	}

}
