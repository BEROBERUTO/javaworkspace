package code12_09;

public class Hero extends Character{

	public void attack(Monster m) {

		System.out.println(this.name+"の攻撃！");
		System.out.println(m.name + "に10ポイントのダメージを与えた！");
		m.hp-=10;
	}

	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}

}
