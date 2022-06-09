package code12_04;

public class Main {

	public static void main(String[] args) {
		Wizard w=new Wizard();
		Character c=w;
		Matango m=new Matango(50);
		c.name="アサカ";
		c.attack(m);
		c.fireball(m);
		
	}

}
