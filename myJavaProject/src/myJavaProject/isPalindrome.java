package myJavaProject;

public class isPalindrome {

	public static void main(String[] args) {
		int integer = 1231321;
		print1();
		System.out.println(check(integer));

	}

	static public int convert(int int2) {
		int reverse = 0;
		while (int2 > 0) {
			int r = int2 % 10;
			int2 /= 10;
			reverse = reverse * 10 + r;
		}
		return reverse;

	}

	static public boolean check(int int3) {

		if (int3 == convert(int3))
			return true;
		return false;

	}

	public static void print1() {
		System.out.println("Test Print");
	}

}
