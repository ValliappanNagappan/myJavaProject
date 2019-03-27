package myJavaProject;

class Frog {
	String name;
	private int age;

	public String setname(String name) {
		// this refers to the instance variable declared in the class. And doesn't refer
		// to the local variable.
		this.name = name;
		return name;
	}
}

public class SetterAndThis {

	public static String main(String[] args) {

		Frog sam = new Frog();

		sam.setname("Sam");
		System.out.println(sam.setname(name));
	}

}
