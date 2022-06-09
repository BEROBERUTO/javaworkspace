package code12_09;

public class Main {

	public static void main(String[] args) {
		Monster[] monsters=new Monster[4];
		monsters[0]=new Goblin();
		monsters[1]=new Matango();
		monsters[2]=new Slime();
		monsters[3]=new DeathBat();

		for(Monster m:monsters) {
			m.run();
		}

	}

}
