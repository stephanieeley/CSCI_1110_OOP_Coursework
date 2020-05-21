//steph eley
//5/20/2020
public class Triangle extends GeometricObject implements Colorable{
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {
		
	}
	public Triangle(double s1, double s2, double s3, boolean filled, String color) {
		super(color,filled);
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public double getSide1() {
		return this.side1;
	}
	public double getSide2() {
		return this.side2;
	}
	public double getSide3() {
		return this.side3;
	}
	
	//@Override
	public void howToColor() {
		System.out.print("Color all 3 sides. ");
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		//return side1 + side2 + side3;
		double s = (this.getPerimeter() / 2);
		double area = Math.sqrt(s * (s- side1) * (s - side2) * (s - side3) );
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		//return 0;
		return side1 + side2 + side3;
		
	}

}
