package code11_17_01;

import code11_16.Human;

public class Fool extends Character implements Human{
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装

	String name;

	public void attack(Matango m) {
		System.out.println(this.name+"は戦わず遊んでいる");
	}


	//さらにHumannから継承した4つの抽象メソッドを実装
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {System.out.println(this.name+"は慌てて逃げ出した");}

}
