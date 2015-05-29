package kadai_017;

public class kadai_017 {

	public static void main(String[] args) {
		int i = 5;
		int j = 9;
		int k = 10;

		System.out.println("入力された数値は" + i + "," + j + "," + k + "で、一番大きな数値は"
				+ returnBiggestNumber(i, j, k) + "です。");
	}

	/**
	 * 3つの数字のうち最大の数字を判定するメソッド
	 * */
	public static int returnBiggestNumber(int i, int j, int k) {
		// 最大の数字biggestNumber初期化
		int biggestNumber = 0;
		// iが最大の時
		if (i > j && i > k) {
			biggestNumber = i;
			// jが最大の時
		} else if (j > i && j > k) {
			biggestNumber = j;
			// kが最大の時
		} else {
			biggestNumber = k;
		}

		return biggestNumber;

	}
}
