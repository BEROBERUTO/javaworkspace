package code06_01;

public class Calc {

	public static void main(String[] args) {
		int a=10,
			b=2,
			total=tasu(a,b),
			delta=hiku(a,b);
		System.out.println("足すと"+total+"、引くと"+delta);
	}

	public static int tasu(int a,int b) {
		return(a+b);
	}

	public static int hiku (int a,int b) {
		return(a-b);

	}

}
