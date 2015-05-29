package kadai_018;

public class kadai_018 {

	// TODO ‚Ü‚¾‚¨‚í‚Á‚Ä‚È‚¢
	public static void main(String[] args) {
		//int[] intArray = {1,2,3,9,11};


	}

	/**
	 * ”z—ñ‚Ì’†g‚ÌŠï”‚Ì‚İ‚ğæ‚èo‚µ‚Ä‰ÁZ‚·‚é
	 * */
	public static int returnSum(int[] array){
		int addNum = 0;
		for(int i:array){
			if(isOddNumber(i)){
				addNum += i;
			}
		}
		return addNum;
	}


	public static boolean isOddNumber(int i){
		if(i%2 != 0){
			return true;
		}else
			return false;
	}


}
