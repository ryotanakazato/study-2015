package kadai_014;

public class kadai_014 {

	public static void main(String[] args) {
		// 最大値1000
		int max = 1000;
		String multiple4 = "fizz";
		String multiple6 = "buzz";
		String multiple12 = "fizz-buzz";

		for (int i = 1; i <= max; i++) {
			if (i % 100 == 0) {
				// 100の倍数の時はfizz-buzzを大文字に
				System.out.println(i + ":" +multiple12.toUpperCase());
				// 12の倍数の時は"fizz-buzz"
			} else if (i % 12 == 0) {
				System.out.println(i + ":" + multiple12);
				// 6の倍数の時は"buzz"
			} else if (i % 4 == 0) {
				System.out.println(i + ":" + multiple4);
				// 4の倍数の時は"fizz"
			} else if (i % 6 == 0)
				System.out.println(i + ":" + multiple6);
			else
				// その他はそのまま表示
				System.out.println(i);

		}

	}
}
