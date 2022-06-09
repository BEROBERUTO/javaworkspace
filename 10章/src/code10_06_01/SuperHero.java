package code10_06_01;

public class SuperHero extends Hero{
	boolean flying;

	public void fly() {
		this.flying=true;
		System.out.println("飛び上がった!");
	}

	public void land() {
		this.flying=false;
		System.out.println("着地した！");
	}

	protected void run() {
		System.out.println(this.name+"撤退した");
	}
}
