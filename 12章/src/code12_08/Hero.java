package code12_08;

public class Hero extends Character{

	public void attack(Matango mt) {

		System.out.println(this.name+"の攻撃！");
		System.out.println(mt.name + "に10ポイントのダメージを与えた！");

		mt.hp-=10;
	}

	public void attack(Goblin gb) {
		System.out.println(this.name+"の攻撃！");
		System.out.println(gb.name + "に10ポイントのダメージを与えた！");
		gb.hp-=10;
	}

	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}

}
