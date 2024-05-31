public class StringMethodsExample {
	public static void main(String[] args) {
		String str = "I like Java. Java is powerful.";

		// Using indexOf
		int firstIndex = str.indexOf("Java");
		System.out.println("First occurrence of 'Java': " + firstIndex); // Outputs: 7

		// Using lastIndexOf
		int lastIndex = str.lastIndexOf("Java");
		System.out.println("Last occurrence of 'Java': " + lastIndex); // Outputs: 13
	}
}

public class Main {
	public static void main(String[] args) {
		// Example of ternary operator
		int a = 10;
		int b = 20;
		// Here we check if 'a' is less than 'b', if true it assigns 'a' to 'min',
		// otherwise 'b' to 'min'.
		int min = (a < b) ? a : b;
		System.out.println("Minimum value: " + min); // Output will be: Minimum value: 10

		// Example of indexOf and lastIndexOf methods in String
		String text = "Hello, I enjoy programming. I also enjoy learning new things.";

		int firstOccurrence = text.indexOf("enjoy");
		int lastOccurrence = text.lastIndexOf("enjoy");

		System.out.println("First occurrence of 'enjoy': " + firstOccurrence); // Output: First occurrence of 'enjoy': 7
		System.out.println("Last occurrence of 'enjoy': " + lastOccurrence); // Output: Last occurrence of 'enjoy': 36

		// Example of length and charAt methods in String
		String str = "I like Java";
		int length = str.length(); // Length of the string
		char character = str.charAt(2); // Character at index 2 (0-based index)

		System.out.println("Length of the string: " + length); // Output: Length of the string: 11
		System.out.println("Character at index 2: " + character); // Output: Character at index 2: l
	}
}