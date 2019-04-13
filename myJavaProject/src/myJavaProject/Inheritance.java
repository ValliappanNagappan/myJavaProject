package myJavaProject;

class Machine {

	// private String name = "CarOne"; private variables can used only within that
	// Class. Sub-Classes cannot use it. Use protected instead.
	protected String name = "CarOne";

	public void start() {
		System.out.println("Machine Started");
	}

	public void stop() {
		System.out.println("Machine Stopped");
	}
}

class Car extends Machine {

	@Override
	public void start() {
		System.out.println(name + ": Car Started");

	}

	/*
	 * public void starts() { System.out.println("Car Started"); }
	 */

	public void run() {
		System.out.println(name + ": Car Running");
	}
}

public class Inheritance {
	public static void main(String[] args) {

		Machine machine1 = new Machine();
		machine1.start();
		machine1.stop();

		Car car1 = new Car();
		car1.start();
		car1.run();
		car1.stop();
	}
}
