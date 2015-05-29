package kadai_014;

public class kadai_014 {

	public static void main(String[] args) {
		// ç≈ëÂíl1000
		int max = 1000;
		String multiple4 = "fizz";
		String multiple6 = "buzz";
		String multiple12 = "fizz-buzz";

		for (int i = 1; i <= max; i++) {
			if (i % 100 == 0) {
				// 100ÇÃî{êîÇÃéûÇÕfizz-buzzÇëÂï∂éöÇ…
				System.out.println(i + ":" +multiple12.toUpperCase());
				// 12ÇÃî{êîÇÃéûÇÕ"fizz-buzz"
			} else if (i % 12 == 0) {
				System.out.println(i + ":" + multiple12);
				// 6ÇÃî{êîÇÃéûÇÕ"buzz"
			} else if (i % 4 == 0) {
				System.out.println(i + ":" + multiple4);
				// 4ÇÃî{êîÇÃéûÇÕ"fizz"
			} else if (i % 6 == 0)
				System.out.println(i + ":" + multiple6);
			else
				// ÇªÇÃëºÇÕÇªÇÃÇ‹Ç‹ï\é¶
				System.out.println(i);

		}

	}
}
