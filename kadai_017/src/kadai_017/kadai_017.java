package kadai_017;

public class kadai_017 {

	private int returnBiggestNumber(int i, int j, int k){
		// �ő�̐���biggestNumber������
		int biggestNumber = 0;
		//i���ő�̎�
		if(i>j && i>k){
			biggestNumber = i;
			//j���ő�̎�
		}else if(j>i && j>k){
			biggestNumber = j;
			//k���ő�̎�
		}else if(k>i && k>j){
		}
		return biggestNumber;

	}
}
