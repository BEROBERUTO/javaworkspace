package calcapp.main;

public class Calc {

	public static void main(String[] args) {
		int a=10,
			b=2,
			total=calcapp.logics.CalcLogic.tasu(a,b),
			delta=calcapp.logics.CalcLogic.hiku(a,b);
		System.out.println("足すと"+total+"、引くと"+delta);
	}
}
