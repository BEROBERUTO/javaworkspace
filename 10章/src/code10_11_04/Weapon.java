package code10_11_04;

public class Weapon extends Item {

	public Weapon() {
		this("ななしの剣");
		System.out.println("Weaponの引数なしのコンストラクタ");
	}

	public Weapon(String name) {
		super(name);
		System.out.println("Weaponの引数1つのコンストラクタ");
	}

	public Weapon(String name,int price) {
		super(name,price);
	}
}
