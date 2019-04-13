package myJavaProject;

class persons {

	int age;
	String name;

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}

	int currentAge() {
		return age;
	}

	String nameReturn() {
		return name;
	}
}

public class GettersAndSetters {

	public static void main(String[] args) {

		persons person1 = new persons();

		person1.age = 50;
		person1.name = "Thats You";

		int age1 = person1.currentAge();
		String name1 = person1.nameReturn();
		int years = person1.calculateYearsToRetirement();

		System.out.println("Your Name is:" + name1);
		System.out.println("Your Age is:" + age1);
		System.out.println("Years left for Retirement is:" + years);

	}

}
