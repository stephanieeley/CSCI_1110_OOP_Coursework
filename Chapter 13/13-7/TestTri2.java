
//Stephanie Eley
//5-20-2020
public class TestTri2 {

	public static void main(String[] args) {

		Triangle[] Tri  = new Triangle[5];
		Tri[0] = new Triangle(4,5,6,true,"buck you red");
		Tri[1] = new Triangle(4,6,9, false,"depressed blue");
		Tri[2] = new Triangle(2,3,4,false,"sunburst yellow");
		Tri[3] = new Triangle(5,6,7,true,"my soul black");
		Tri[4] = new Triangle(7,8,9,true,"prickley pear pink");

		for(int i = 0; i < Tri.length; i++){
			System.out.println("The perimeter is: " + Tri[i].getPerimeter());
			System.out.println("The area is: " + Tri[i].getArea());
			System.out.println("The color of the triangle is: "+ Tri[i].getColor());
			System.out.println("The Triangle is filled: " + Tri[i].isFilled());
			System.out.println("the date the triangle was created is: " + Tri[i].getDateCreated());
			if(Tri[i].isFilled()) {
				Tri[i].howToColor();
			}
		}

	}
}

