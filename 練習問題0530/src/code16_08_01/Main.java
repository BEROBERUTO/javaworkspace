package code16_08_01;

import java.util.ArrayList;
import java.util.List;

class Hero{
	public String name;
}

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.name="ミナト";
		List<Hero>list=new ArrayList<Hero>();
		list.add(h);
		Hero h1=new Hero();
		h1.name="スガワラ";
		h=h1;
		System.out.println(list.get(0).name);
	}

}
