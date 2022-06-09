package code01_04;

public class Main {

	public static void main(String[] args) {
		double pi =3.14;//円周率を表現
		int pie =5;//半径を表現
		System.out.println("半径"+pie+"cmのパイの面積は、");
		System.out.println(pie*pie*pi);
		System.out.println("パイの半径を倍にします");
		pi=10;
		System.out.println("半径"+pie+"cmのパイの面積は、");
		System.out.println(pie*pie*pi);
	}

}
