package code03_02_01;

public class Main2 {

	public static void main(String[] args) {
		boolean doorClose = true;//ここでtrueかfalseを代入
		int count =1;//ループカウンタ
		while(doorClose == true) {
			System.out.println("ノックする");
			System.out.println("１分待つ");
			if(count == 5) {
				doorClose = false;
				System.out.println("別のトイレを捜すことにした");
			}
			count++;
		}
	}

}
