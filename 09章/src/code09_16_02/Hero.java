package code09_16_02;

public class Hero {
	String name;
	int hp;

	//コンストラクタ①
	public Hero(String name) {
		this.hp=100;
		this.name=name;
	}

	//コンストラクタ②
	public Hero() {
		super();
		this("ダミー");
		int a;
	}
}
