package quziAns15_05_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
	//p595 表15-9 上から3番目
    LocalDate now = LocalDate.now();

    //p596 表15-10 下から３番目
    //指定した日付分プラスする→未来
    LocalDate future = now.plusDays(100);

    //参考コード15-16→引数内の表示形式でインスタンスを表示
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}
