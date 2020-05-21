import java.util.Scanner;

//steph eley
// 05/20/2020
public class TestTriangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for side one: ");
		double s1 = input.nextDouble();
		System.out.println("Enter a number for side two: ");
		double s2 = input.nextDouble();
		System.out.println("Enter a number for side three: ");
		double s3 = input.nextDouble();
		System.out.println("Enter a color: ");
		String color = input.next();
		//System.out.println(color);
		System.out.println("Is it filled, type true or false. ");
		boolean fill = input.nextBoolean();
		
		Triangle tri = new Triangle(s1, s2, s3);
		tri.setColor(color);
		tri.setFilled(fill);
		//System.out.println(tri);
		System.out.println("The perimeter is: " + tri.getPerimeter());
		System.out.println("The area is: " + tri.getArea());
		System.out.println("The color of the triangle is: "+ tri.getColor());
		System.out.println("The Triangle is filled: " + tri.isFilled());
		System.out.println("the date the triangle was created is: " + tri.getDateCreated());
		tri.howToColor();
	}

}
