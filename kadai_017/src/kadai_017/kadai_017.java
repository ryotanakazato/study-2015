package kadai_017;

public class kadai_017 {

	public static void main(String[] args) {
		int i = 5;
		int j = 9;
		int k = 10;

		System.out.println("���͂��ꂽ���l��" + i + "," + j + "," + k + "�ŁA��ԑ傫�Ȑ��l��"
				+ returnBiggestNumber(i, j, k) + "�ł��B");
	}

	/**
	 * 3�̐����̂����ő�̐����𔻒肷�郁�\�b�h
	 * */
	public static int returnBiggestNumber(int i, int j, int k) {
		// �ő�̐���biggestNumber������
		int biggestNumber = 0;
		// i���ő�̎�
		if (i > j && i > k) {
			biggestNumber = i;
			// j���ő�̎�
		} else if (j > i && j > k) {
			biggestNumber = j;
			// k���ő�̎�
		} else {
			biggestNumber = k;
		}

		return biggestNumber;

	}
}
