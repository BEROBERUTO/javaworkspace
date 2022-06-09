package code12_02;

public class Main {

	public static void main(String[] args) {
		Wizard w=new Wizard();
		Matango m=new Matango(50);
		w.name="アサカ";
		w.attack(m);
		w.fireball(m);
	}

}
