package myJavaProject;

class Frog {
	private String name;
	private int age;

	public String setname(String name) {
		// this refers to the instance variable declared in the class. And doesn't refer
		// to the local variable.
		this.name = name;
		// System.out.println(name);
		return name;
	}
}

public class SetterAndThis {

	public static void main(String[] args) {

		Frog sam = new Frog();

		sam.setname("Sam");
		// System.out.println(sam.setname());
		// sam.setname();
	}

}
