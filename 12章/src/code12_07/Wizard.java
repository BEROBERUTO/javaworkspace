package code12_07;

public class Wizard extends Character{

	public void attack() {

		System.out.println(this.name+"の攻撃！");
		System.out.println("5のダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}

}
