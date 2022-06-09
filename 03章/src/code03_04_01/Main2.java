package code03_04_01;

public class Main2 {

	//得点
	public static void main(String[] args) {
		int points = 60;
		if (points >= 35) {
			System.out.println("成績：可");
		}else if(points >= 50) {
			System.out.println("成績：良");
		}else if(points >= 70) {
			System.out.println("成績：優");
		}else {
			System.out.println("追試です");
		}
	}

}
