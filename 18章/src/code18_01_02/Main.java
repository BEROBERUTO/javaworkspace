package code18_01_02;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileReader fr=null;
		try{
			fr=new FileReader("data.txt");
			int input=fr.read();

			while(input!=-1){
				System.out.println((char)input);
				input=fr.read();
			}

		}catch(Exception e) {
				System.out.println("何らかの例外が発生しました");
			}finally{
				if(fr!=null) {
					try {
					 fr.close();
					}catch(IOException e) {
						;
					}
				}
			}
	}
}
