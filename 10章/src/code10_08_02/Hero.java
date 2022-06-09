package code10_08_02;

public class Hero {
	String name="ミナト";
	int hp=100;
	boolean flying;
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃!");
		m.hp-=10;
		System.out.println("10ポイントのダメージをあたえた！");
	}

	//逃げる
	public void run() {
		System.out.println(this.name+"は逃げ出した！");
	}

	//飛ぶ
	public void fly() {
		this.flying=true;
		System.out.println("飛び上がった!");
	}

	//着地する
	public void land() {
		this.flying=false;
		System.out.println("着地した!");
	}

	public final void slip() {
		this.hp=-5;
		System.out.println(this.name+"は転んだ!");
		System.out.println("5のダメージ");
	}

}
