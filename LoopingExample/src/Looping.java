public class Looping {

	public static void main(String[] args) {
		for (int i = 0, j = 0; (i < 11) && (j < 10); i++, j++) {
			System.out.println(" i is " + i + " j is " + j);
		}
		String[] names = { "sanju", "dhanya", "our baby" };
		for (String s : names) {
			System.out.println(s);
		}

		int[][] numbers = { { 1, 2, 3 }, { 3, 4 }, { 4, 5, 6 } };
		// Loop through the 1st array
		for (int num : numbers[1]) {
			System.out.println(num);
		}

		int age = 0;
		outer: while (age <= 21) {
			age++;
			if (age == 16) {
				System.out.println("get dc");
				break outer;
			}
			System.out.println("another year");
		}
		System.out.println("congrats");

	}

}
