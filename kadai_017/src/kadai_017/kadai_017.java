package kadai_017;

public class kadai_017 {


	public int returnBiggestNumber(int i, int j, int k) {
		// �ő�̐���biggestNumber������
		int biggestNumber = 0;
		// i���ő�̎�
		if (i > j && i > k) {
			biggestNumber = i;
			// j���ő�̎�
		} else if (j > i && j > k) {
			biggestNumber = j;
			// k���ő�̎�
		} else if (k > i && k > j) {
			biggestNumber = k;
		}
		System.out.println("���͂��ꂽ���l��" + i + "," + j + "," + k + "�ŁA��ԑ傫�Ȑ��l��"
				+ biggestNumber + "�ł�");
		return biggestNumber;

	}
}
