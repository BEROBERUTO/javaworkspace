package code12_06;

public class Hero extends Character {

	public void attack() {

		System.out.println(this.name+"の攻撃！");
		System.out.println("5のダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}

}
