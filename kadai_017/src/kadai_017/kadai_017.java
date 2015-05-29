package kadai_017;

public class kadai_017 {

	private int returnBiggestNumber(int i, int j, int k){
		int biggestNumber = 0;
		if(i>j && i>k){
			biggestNumber = i;
		}else if(j>i && j>k){
			biggestNumber = j;
		}else if(k>i && k>j){
		}
		return biggestNumber;

	}
}
