package myJavaProject;

class Person {
	String name;
	int age;
	float weight;

	void speak() {

		System.out.println("Hi" + " " + name);
	}

	void hello() {
		System.out.println("How are you?");
	}
}

public class ClassesAndObjects {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 25;

		System.out.println(person1.name + '\t' + person1.age);
		// person2.name="Root";

	}

}
