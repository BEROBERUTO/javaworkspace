package code16_02_01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<>();
		name.add("湊");
		name.add("朝香");
		name.add("菅原");

		Iterator<String>it=name.iterator();
		while(it.hasNext()) {
			String e=it.next();
			System.out.println(e);
		}
	}

}
