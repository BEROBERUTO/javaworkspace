package code06_04;

public class Calc {

	public static void main(String[] args) {
		int a=10,
			b=2,
			total=CalcLogic.tasu(a,b),
			delta=CalcLogic.hiku(a,b);
		System.out.println("足すと"+total+"、引くと"+delta);
	}
}
