package quizAns04_04;

public class Main3 {

	public static void main(String[] args) {
		int[] numbers= {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input=new java.util.Scanner(System.in).nextInt();

		//ハズレも表示する
		int falseCount=0;
		for(int n:numbers) {
			if(n==input) {
				System.out.println("アタリ!");
			}else{
				falseCount++;
			}
		}
		if(falseCount==3) {
			System.out.println("ハズレ");
		}

	}

}
