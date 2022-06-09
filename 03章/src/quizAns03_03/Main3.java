package quizAns03_03;

public class Main3 {

	public static void main(String[] args) {
		int isHungry=1;
		String food="あんぱん";

		System.out.println("こんにちは");

		System.out.println(isHungry==0?"お腹がいっぱいです":"腹ペコです");

		if(isHungry==1) {
			System.out.println(food+"をいただきます");
		}

		System.out.println("ごちそうさまでした");
	}

}
