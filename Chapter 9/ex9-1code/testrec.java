// Stephanie Eley
//3.25.2020
public class testrec{
    public static void main(String[] args){

        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);
        
        System.out.println("The width is " + rec1.width);
        System.out.println("The height is " + rec1.height);
        System.out.println("The area is  "+ rec1.getArea());
        System.out.println("The perimeter is "+ rec1.getPerimeter());
        
        System.out.println("The width is " + rec2.width);
        System.out.println("The height is " + rec2.height);
        System.out.println("The area is " + rec2.getArea());
        System.out.println("The perimeter is " + rec2.getPerimeter());
    }
}