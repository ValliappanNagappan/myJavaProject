package myJavaProject;

public class OutputArgs {

	// public static void main(String[] args) {
	// for (int i = 0; i < args.length; i++) {
	// System.out.println(args[i]);
	public static void main(String[] test) {
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
			/*
			 * When some arguments are passed from command line, they will be received in
			 * args. 'args' is just a name and it is a standard. But it can be anything.
			 */
		}
	}

}
