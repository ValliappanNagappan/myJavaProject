package myJavaProject;

public class StringBuilderOne {

	public static void main(String[] args) {

		// System creates 2 strings here which is not efficient
		String one = "Hi";
		one += " There";
		System.out.println(one);

		// Use StringBuilder
		StringBuilder two = new StringBuilder("Hi");
		two.append(" ");
		two.append("This is");
		two.append(" StrinBuilder");
		System.out.println(two);
		System.out.println(two.toString());

		StringBuilder three = new StringBuilder("Hi").append(" ").append("This is")
				.append(" StrinBuilder in a different way");
		System.out.println(three.toString());

	}

}
