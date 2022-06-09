package quizAns08_03;

	public class Cleric {
		String name;//名前
		int hp;
		final int MAXHP=50;
		int mp;
		final int MAXMP=10;

		public void selfAid() {
			System.out.println("聖職者はセルフエイドを唱えた");
			this.mp-=5;
			this.hp=this.MAXHP;
			System.out.println("聖職者はHP50まで回復した");

		}
}
