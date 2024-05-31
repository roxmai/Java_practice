public class quiz3_practice {
	public static void main(String[] args) {
//		5.15. Chapter 5 Self Test
//		Show two ways to declare a one-dimensional array of 12 doubles.
		double [] array1 = new double [12];
		double array2 [] = new double [12];
//		Show how to initialize a one-dimensional array of integers to the values 1 through 5.
		int [] a3 = new int[5];
		for (i = 0; i < a3.length; i++) {
			a3[i] = i + 1;
		}
//		Write a program that uses an array to find the average of 10 double values. Use any 10 values you like.
		double [] a4 = new double[10];
		for (i = 0; i < a4.length, i++) {
			a4[i] = i + 1;
		}
		double sum = 0.0;
		for (j = 0; j < a4.length, j++) {
			sum += a4[j];
		}
		double average = sum / a4.length;
		System.out.println(average);
		
//		Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works.
	}

	public static void question4(String[] args) {

		String[] arrayslol = { "apple", "balalala", "lol" };

		bubbleSort(arrayslol);

	}

	}

	public static void bubbleSort(String[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) { // Compare strings lexicographically
					// Swap array[j] and array[j+1]
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(String[] array) {
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public class Example {

	    public static void main(String[] args) {
	        // 1. Demonstrate difference between indexOf and lastIndexOf
	        String str = "I like Java, Java is cool";
	        System.out.println("indexOf 'Java': " + str.indexOf("Java")); // First occurrence
	        System.out.println("lastIndexOf 'Java': " + str.lastIndexOf("Java")); // Last occurrence

	        // 2. Call length() and charAt() on string literal
	        String exampleStr = "I like Java";
	        int length = exampleStr.length();
	        char charAtFive = exampleStr.charAt(5);
	        System.out.println("Length: " + length + ", charAt(5): " + charAtFive);

	        // 3. Encode cipher class using an eight-character string as the key (example implementation)
	        class Encode {
	            private String key;

	            Encode(String key) {
	                if (key.length() != 8) {
	                    throw new IllegalArgumentException("Key must be 8 characters long.");
	                }
	                this.key = key;
	            }
	            // Add encode and decode methods as needed...
	        }
	        Encode encoder = new Encode("key12345");

	        // 4. Can bitwise operators be applied to double type? - No, they can't.
	        // double a = 5.0;
	        // double b = 3.0;
	        // double c = a & b; // This would result in compilation error.

	        // 5. Sequence rewritten using ? operator
	        int a = 10;
	        int b = 20;
	        int min = (a < b) ? a : b;
	        System.out.println("Min: " + min);
//	        Explanation: The ternary operator (condition) ? true_expression : false_expression is used to make the code concise.
	        
	        
	        // 6. In fragment, is the & a bitwise or logical operator?
	        boolean logicalOp = (a == 10) & (b == 20); // Here & is used as a logical operator
	        System.out.println("Logical and: " + logicalOp);
//	        In if (a & b), & is a bitwise operator.
//	        In if (a == b & b == c), & acts as a logical operator checking both conditions.
	        

	        // 7. Error to overrun the end of an array / index array with a negative value
	        int[] array = new int[5];
	        // array[5] = 10; // Error: ArrayIndexOutOfBoundsException
	        // array[-1] = 10; // Error: ArrayIndexOutOfBoundsException

	        // 8. Unsigned right-shift operator
	        int x = -16;
	        int result = x >>> 2;
	        System.out.println("Unsigned right shift: " + result);

	        // 9. Rewrite MinMax class using for-each loop
	        class MinMax {
	            public void findMinMax(int[] nums) {
	                int min = nums[0];
	                int max = nums[0];
	                for (int num : nums) {
	                    if (num < min) {
	                        min = num;
	                    }
	                    if (num > max) {
	                        max = num;
	                    }
	                }
	                System.out.println("Min: " + min + ", Max: " + max);
	            }
	        }
	        new MinMax().findMinMax(new int[]{3, 5, 1, 8, 2, 10});
	        
	        public class MinMax2 {
	            public static void main(String[] args) {
	                int[] nums = {99, -10, 121, 100, 18, 76};
	                int min, max;
	                min = max = nums[0];

	                for (int num : nums) {
	                    if (num < min) min = num;
	                    if (num > max) max = num;
	                }

	                System.out.println("Min: " + min);
	                System.out.println("Max: " + max);
	            }
	        }

	        // 10. Convert Bubble sort loops to for-each
	        // Cannot be done because for-each loops do not support swapping elements in the array

	        // 11. Can a String control a switch statement? - Yes, in Java 7 and later
	        String command = "stop";
	        switch (command) {
	            case "start":
	                System.out.println("Starting");
	                break;
	            case "stop":
	                System.out.println("Stopping");
	                break;
	            default:
	                System.out.println("Unknown command");
	        }

	        // 12. Keyword for local variable type inference - 'var'
	        var done = false;
	        System.out.println("Done: " + done);

	        // 13. Can var be the name of a variable? Can var be the name of a class?
	        // No, var cannot be used as the name of a variable but can be a class name
	        class Var { }
	        Var myVarInstance = new Var();

	        // 14. Is the following declaration valid?
	        // int public = 10; // Not valid. 'public' is a reserved keyword.

	        // 15. Is the following declaration valid?
	        // var a = null; // Not valid. var needs to have an explicit type assigned.
	    }
	}
