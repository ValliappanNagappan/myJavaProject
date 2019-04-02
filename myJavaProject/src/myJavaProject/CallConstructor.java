package myJavaProject;

class FirstConstructor {
	private String name = "Initial";

	FirstConstructor() {
		this("BaxterAgain");
		System.out.println("First Constructor running");

	}

	FirstConstructor(String name) {
		this.name = name;
		System.out.println("Second Constrcutor running:" + " " + name);
	}
}

public class CallConstructor {

	public static void main(String[] args) {

		// FirstConstructor one = new FirstConstructor();
		new FirstConstructor();
		new FirstConstructor("Baxter");
	}

}
