package kadai_022;

public class kadai_022_2 {

	public static void main(String[] args) {
		Human human1 = new Human("品川 泰晟", "1992年3月30日");
		human1.age = 23;
		human1.girlFriend = "iru";

		Human human2 = new Human("田部井 孝明", "1987年5月2日");
		human2.age = 28;

		Human human3 = new Human("佐々木 直貴", "1987年10月7日");
		human3.age = 27;

		Human human4 = new Human("山内 宏之", "1987年12月6日");
		human4.age = 27;

		Human human5 = new Human("中里 亮太", "1990年7月6日");
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
		System.out.println("名前 : "+this.mName);
		System.out.println("生年月日 :" +this.mBirthday);
		System.out.println("年齢 : "+this.age);
		System.out.println(this.girlFriend);
		System.out.println("");
	}

}