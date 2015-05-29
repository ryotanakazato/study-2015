package kadai_014;

public class kadai_014 {

	public static void main(String[] args) {
		int max = 1000;
		String multiple4 = "fizz";
		String multiple6 = "buzz";
		String multiple12 = "fizz-buzz";

		for (int i = 1; i <= max; i++) {
			if (i % 100 == 0) {
				System.out.println(i + ":" +multiple12.toUpperCase());
			} else if (i % 12 == 0) {
				System.out.println(i + ":" + multiple12);
			} else if (i % 4 == 0) {
				System.out.println(i + ":" + multiple4);
			} else if (i % 6 == 0)
				System.out.println(i + ":" + multiple6);
			else
				System.out.println(i);

		}

	}
}
