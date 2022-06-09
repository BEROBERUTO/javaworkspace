package code17_13_01;

public class Main {

	public static void main(String[] args) {
		try {
			//試験的に例外を発生される
			throw new UnsupportedMusicFileException
				("未対応のファイルです");

		}
	}
}
