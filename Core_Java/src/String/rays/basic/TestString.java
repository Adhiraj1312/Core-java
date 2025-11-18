package String.rays.basic;

public class TestString {
	public static void main(String[] args) {

		String name = "Adhiraj Singh Tomar";

		System.out.println("name :" + name);

		System.out.println("Length:" + name.length());

		System.out.println("10th character is :" + name.charAt(9));

		System.out.println("First  index of r :" + name.indexOf('r'));

		System.out.println("last index of o:" + name.lastIndexOf('o'));

		System.out.println(name.replace('a', 'b'));

		System.out.println("lower Case:" + name.toLowerCase());

		System.out.println("Upper Case: " + name.toUpperCase());

		System.out.println(name.startsWith("Adhi"));

		System.out.println(name.endsWith("ar"));

		System.out.println(name.substring(2, 11));
	}
}
