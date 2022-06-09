package code13_13;

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();

		h.setName("ラインハルトフォンローエングラム");
		//h.name="ミナト";
		h.setHp(100);
		//h.hp=100;


		King k=new King();
		k.talk(h);

	}

}
