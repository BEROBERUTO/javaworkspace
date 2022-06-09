package code12_08;

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.name="ミナト";
		Matango mt=new Matango();
		h.attack(mt);
		Goblin gb=new Goblin();
		h.attack(gb);
		//冒険開始！
		//まず宿屋に泊まる

	}

}
