package myJavaProject;

//This class is already present in ClassesAndObjects class
//class Person {
//String name;
//int age;

//void speak() {
//System.out.println("Hi" + name);
//}

//void hello() {
//System.out.println("How are you?");
//}
//}

public class Methods {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Robert";
		person1.age = 35;
		person1.speak();
		person1.hello();

		// Person2 is inside FirstProject
		Try person2 = new Try();
		person2.tryThis();

		// Calls the main method inside TryThis
		// TryThis.main(args);
		TryThis.main(null);

	}

}
