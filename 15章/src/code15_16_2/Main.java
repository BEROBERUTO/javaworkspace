package code15_16_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		//文字列からLocalDateを生成
		DateTimeFormatter fmt=
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate=LocalDate.parse("2020/09/22",fmt);
		System.out.println("今日は"+ldate+"です");

		//1000日後を計算する
		LocalDate ldatep=ldate.plusDays(1000);
		String str=ldatep.format(fmt);
		System.out.println("1000日後は"+str);

		//現在日時と1000日後の比較
		LocalDate now=LocalDate.now();
		System.out.println(now);
		if(now.isBefore(ldatep)) {
			System.out.println("今日は1000日後から見ると過去日付です");
		}

	}

}
