package kadai_014;

public class kadai_014 {

	public static void main(String[] args) {
		// �ő�l1000
		int max = 1000;
		String multiple4 = "fizz";
		String multiple6 = "buzz";
		String multiple12 = "fizz-buzz";

		for (int i = 1; i <= max; i++) {
			if (i % 100 == 0) {
				// 100�̔{���̎���fizz-buzz��啶����
				System.out.println(i + ":" +multiple12.toUpperCase());
				// 12�̔{���̎���"fizz-buzz"
			} else if (i % 12 == 0) {
				System.out.println(i + ":" + multiple12);
				// 6�̔{���̎���"buzz"
			} else if (i % 4 == 0) {
				System.out.println(i + ":" + multiple4);
				// 4�̔{���̎���"fizz"
			} else if (i % 6 == 0)
				System.out.println(i + ":" + multiple6);
			else
				// ���̑��͂��̂܂ܕ\��
				System.out.println(i);

		}

	}
}
