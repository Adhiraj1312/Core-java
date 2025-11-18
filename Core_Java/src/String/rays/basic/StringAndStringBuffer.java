package String.rays.basic;

public class StringAndStringBuffer {
	public static void main(String[] args) {

		String name = "adhiraj";

		System.out.println(name);

		System.out.println(name.replace('a', 's'));

		System.out.println(name); // print the same value because String is immutable

		System.out.println("---------------------------");

		StringBuffer sb = new StringBuffer("adhiraj");

		System.out.println(sb);

		System.out.println(sb.append("singh"));

		System.out.println(sb);

	}
}
