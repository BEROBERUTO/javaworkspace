package quizAns08_04_01;

import java.util.Random;

	public class Cleric {
		String name;//名前
		int hp=50;
		final int MAXHP=50;
		int mp=10;
		final int MAXMP=10;

		public void selfAid() {
			System.out.println(this.name+"はセルフエイドを唱えた");

			if(mp>=5) {
				this.mp-=5;
				this.hp=this.MAXHP;
				System.out.println(this.name+"はHP50まで回復した");
				}else {
					System.out.println("魔法力が足りません");
				}

		}

		public int pray(int second) {
			System.out.println(this.name+"は"+second+"秒間天に祈った！");

			//論理上の回復量を乱数を用いて決定する
			int recover=new Random().nextInt(3)+second;

			//実際の回復量を計算する
			int recoverActual=Math.min(this.MAXMP-this.mp,recover);

			this.mp+=recoverActual;
			System.out.println(this.name+"はMPが"+recoverActual+"回復した");
			return recoverActual;


		}
	}
