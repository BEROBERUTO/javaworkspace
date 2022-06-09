package quizAns10_03;

public class PoisonMatango extends Matango {

	String name="お化けキノコ";
	int poisonCount=5;

	//コンストラクタ
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);

		//毒攻撃
		if(this.poisonCount>0) {
			System.out.println("さらに毒の胞子をばらまいた!");
			int dmg=h.hp/5;
			h.hp-=dmg;
			System.out.println(dmg+"ポイントのダメージ!");
			this.poisonCount--;
		}
	}
}
