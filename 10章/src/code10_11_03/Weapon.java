package code10_11_03;

public class Weapon extends Item {

	public Weapon() {
		this("ななしの剣");
	}
	
	public Weapon(String name) {
		super(name);
	}

	public Weapon(String name,int price) {
		super(name,price);
	}
}
