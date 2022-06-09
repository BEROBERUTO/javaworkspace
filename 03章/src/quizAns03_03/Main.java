package quizAns03_03;

public class Main {

	public static void main(String[] args) {
		int isHungry=1;
		String food="あんぱん";

		System.out.println("こんにちは");

		if(isHungry==0){
			System.out.println("お腹がいっぱいです");
		}
		else {
			System.out.println("腹ぺこです");
			System.out.println(food+"をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}

}
