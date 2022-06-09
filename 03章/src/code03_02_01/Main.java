package code03_02_01;

public class Main {

	public static void main(String[] args) {
		boolean doorClose = true;//ここでtrueかfalseを代入
		while(doorClose == true) {
			System.out.println("ノックする");
			System.out.println("１分待つ");
			doorClose = false;
		}
	}

}
