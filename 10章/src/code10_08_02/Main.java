package code10_08_02;

public class Main {

	public static void main(String[] args) {

		Hero h=new Hero();
		h.run();
		Matango m=new Matango();
		SuperHero sh=new SuperHero();
		sh.fly();
		sh.attack(m);

	}

}
