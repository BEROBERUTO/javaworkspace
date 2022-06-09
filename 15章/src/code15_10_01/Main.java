package code15_10_01;

public class Main {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();

		//ここで何らかの時間がかかる処理
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<1000;i++) {
			sb.append("Java");
		}
		String s=sb.toString();
		System.out.println(s);


		long end=System.currentTimeMillis();
		System.out.println("処理にかかった時間は…"
				+(end-start)+"ミリ秒でした");
	}

}
