package kadai_022;

public class kadai_022_2 {

	public static void main(String[] args) {
		Human human1 = new Human("�i�� �ם�", "1992�N3��30��");
		human1.age = 23;
		human1.girlFriend = "iru";

		Human human2 = new Human("�c���� �F��", "1987�N5��2��");
		human2.age = 28;

		Human human3 = new Human("���X�� ���M", "1987�N10��7��");
		human3.age = 27;

		Human human4 = new Human("�R�� �G�V", "1987�N12��6��");
		human4.age = 27;

		Human human5 = new Human("���� ����", "1990�N7��6��");
		human5.age = 24;

		human1.display();
		human2.display();
		human3.display();
		human4.display();
		human5.display();
	}

}

class Human {

	private String mName;
	private String mBirthday;
	int age;
	String girlFriend;

	Human(){}

	Human(String name, String birthday) {
		this.mName = name;
		this.mBirthday = birthday;
	}
	public void display(){
		System.out.println("���O : "+this.mName);
		System.out.println("���N���� :" +this.mBirthday);
		System.out.println("�N�� : "+this.age);
		System.out.println(this.girlFriend);
		System.out.println("");
	}

}