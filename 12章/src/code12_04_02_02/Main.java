package code12_04_02_02;

public class Main {

	public static void main(String[] args) {
		Wizard w=new Wizard();
		Character c=w;
		if(c instanceof Wizard) {
			w=(Wizard)c;
		}
		Matango m=new Matango(50);
		c.name="アサカ";
		c.attack(m);
		c.run();
		w.run();
	}

}
