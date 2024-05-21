
public class Bubble {
// try Bubble sort
	public static void main(String[] args) {
		int[] nums = { 99, 0, 100, 12 };

		int a, b, t;
		int size;

		// number of elements to sort
		size = 4;

		// display original array
		System.out.println("original array is:");
		for (int i = 0; i < size; i++)
			System.out.println(" " + nums[i]);
		System.out.println();

		// this is the Bubble sort
		// TODO: algorithm
		for (a = 1; a < size; a++) {
			for (b = size - 1; b >= a; b--) { // TODO: help me check if this is correct

				if (nums[b - 1] > nums[b]) { // if out of order
					// exchange elements
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
//					System.out.println("a is " + a + " and b is " + b + " t is " + t);
					System.out.println(
							String.format("a,b,t,nums[b-1], nums[b-1], %s %s %s %s %s", a, b, t, nums[b - 1], nums[b]));

				}
//				System.out.println("a: " + a + " and b is " + b + " t is " + t);
			}
		}
		// display sorted array
		System.out.println("Sorted array is:");
		for (int i = 0; i < size; i++)
			System.out.println(" " + nums[i]);
		System.out.println();

	}

}
