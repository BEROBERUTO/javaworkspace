package quizAns15_01_02;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append(i+1).append(",");
    }
    String s = sb.toString();

    //画面出力文がないので状況不明→sysoutをつくる
    System.out.println(s);

    String[] a = s.split(",");

    //分割できているか確認
    for(String divStr : a) {
    	System.out.println(divStr);
    }



  }
}
