package code12_04_02_01;

public class Main {

	public static void main(String[] args) {
		Wizard w=new Wizard();
		Character c=w;
		w=(Wizard)c;
		Matango m=new Matango(50);
		c.name="アサカ";
		c.attack(m);
		c.run();
		w.run();
	}

}
