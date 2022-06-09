package code15_09;

public class Main {

	public static void main(String[] args) {
		final String FORMAT="%-9s %-13s 所持金%,6d";

		Hero hero=new Hero();
		Witch w=new Witch();

		hero.setName("minato");
		hero.setJob("hero");
		hero.setGold(280);

		w.setName("asaka");
		w.setJob("witch");
		w.setGold(32000);

		String s=String.format
				(FORMAT,hero.getName(),hero.getJob(),hero.getGold());
		System.out.println(s);

		String s2=String.format
				(FORMAT,w.getName(),w.getJob(),w.getGold());
		System.out.println(s2);

		}

}
