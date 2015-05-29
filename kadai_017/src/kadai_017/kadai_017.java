package kadai_017;

public class kadai_017 {

	private int returnBiggestNumber(int i, int j, int k){
		// Å‘å‚Ì”šbiggestNumber‰Šú‰»
		int biggestNumber = 0;
		//i‚ªÅ‘å‚Ì
		if(i>j && i>k){
			biggestNumber = i;
			//j‚ªÅ‘å‚Ì
		}else if(j>i && j>k){
			biggestNumber = j;
			//k‚ªÅ‘å‚Ì
		}else if(k>i && k>j){
		}
		return biggestNumber;

	}
}
