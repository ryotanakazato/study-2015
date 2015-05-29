package kadai_017;

public class kadai_017 {


	public int returnBiggestNumber(int i, int j, int k) {
		// Å‘å‚Ì”šbiggestNumber‰Šú‰»
		int biggestNumber = 0;
		// i‚ªÅ‘å‚Ì
		if (i > j && i > k) {
			biggestNumber = i;
			// j‚ªÅ‘å‚Ì
		} else if (j > i && j > k) {
			biggestNumber = j;
			// k‚ªÅ‘å‚Ì
		} else if (k > i && k > j) {
			biggestNumber = k;
		}
		System.out.println("“ü—Í‚³‚ê‚½”’l‚Í" + i + "," + j + "," + k + "‚ÅAˆê”Ô‘å‚«‚È”’l‚Í"
				+ biggestNumber + "‚Å‚·");
		return biggestNumber;

	}
}
