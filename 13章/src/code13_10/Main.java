package code13_10;

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();

		h.setName("ミナト");
		//h.name="ミナト";
		h.setHp(100);
		//h.hp=100;


		King k=new King();
		k.talk(h);

	}

}
