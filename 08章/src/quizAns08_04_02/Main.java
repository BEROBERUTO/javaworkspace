package quizAns08_04_02;

public class Main {

	public static void main(String[] args) {
		Cleric a=new Cleric();
		a.name="マァム";
		a.selfAid();
		int rA=a.pray(1);

		System.out.println("MPが"+rA+"回復した");

		a.selfAid();
		a.selfAid();

	}

}
