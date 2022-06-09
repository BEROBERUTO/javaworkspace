package code13_01;

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;

		Matango m=new Matango();
		m.suffix='A';

		h.attack(m);
		System.out.println(h.hp);
	}

}
