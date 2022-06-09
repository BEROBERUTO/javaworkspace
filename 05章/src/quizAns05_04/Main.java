package quizAns05_04;

public class Main {

	public static void main(String[] args) {
		double bottom=10.0;
		double height=5.0;
		double triangleArea=calcTriangleArea(bottom,height);
		System.out.println("底辺の長さが"+bottom+"cm、高さが"+height+
				"cmの三角形の面積は"+triangleArea+"cm^2"
						+ "でござる。");
		double radius=5.0;
		double circleArea=calcCirleArea(radius);
		System.out.println("半径"+radius+"cmの円の面積は、円周率を3.14とすると、"
				+circleArea+"cm^2でござる。");
	}

	public static double calcTriangleArea(double bottom,double height) {
		double area=(bottom*height)/2;
		return area;
	}

	public static double calcCirleArea(double radius) {
		double area=radius*radius*3.14;
		return area;

	}
}
