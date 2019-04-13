package myJavaProject;

class froggie {
	private String name;
	private int id;

	public froggie(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		// return "Hi";
		// return "ID :" + id + " " + "Name :" + name;
		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append("Name: ").append(name).append(" ").append("id: ").append(id);
		 * 
		 * return sb.toString();
		 */
		return String.format("Name: %s ID: %-4d", name, id);
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		froggie frog1 = new froggie("SFROGGIE", 007);
		System.out.println(frog1);
	}

}
