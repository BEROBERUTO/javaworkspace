package code13_02;

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;

		Matango m=new Matango();
		m.suffix='A';

		Inn inn=new Inn();
		inn.checkIn(h);

		h.attack(m);
		System.out.println(h.hp);


	}

}
