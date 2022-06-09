package quziAns09_02_02;

public class Main {

	public static void heal(int hp) {
		hp+=10;
	}

	public static void heal(Thief thief) {
		thief.hp+=10;
	}

	public static void main(String[] args) {

		Thief t1=new Thief("来生 泪",40,5);
		System.out.println("盗賊1:"+t1.name+":"+t1.hp+":"+t1.mp);

		Thief t2=new Thief("来生 瞳",35);
		System.out.println("盗賊2:"+t2.name+":"+t2.hp+":"+t2.mp);

		Thief t3=new Thief("来生 愛");
		System.out.println("盗賊3:"+t3.name+":"+t3.hp+":"+t3.mp);
	}


}

