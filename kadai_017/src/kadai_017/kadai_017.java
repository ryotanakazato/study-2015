package kadai_017;

public class kadai_017 {

	private int returnBiggestNumber(int i, int j, int k){
		// 最大の数字biggestNumber初期化
		int biggestNumber = 0;
		//iが最大の時
		if(i>j && i>k){
			biggestNumber = i;
			//jが最大の時
		}else if(j>i && j>k){
			biggestNumber = j;
			//kが最大の時
		}else if(k>i && k>j){
		}
		return biggestNumber;

	}
}
