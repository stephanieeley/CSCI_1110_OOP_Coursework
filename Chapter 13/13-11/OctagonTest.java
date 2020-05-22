//5.20.2020
//Stephanie Eley
public class OctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		double side = 7;
		Octagon oct = new Octagon(7);

		System.out.println("The area is: " + oct.getArea());
		Octagon oct2 = (Octagon) oct.clone();

		int comp = oct.compareTo(oct2);
		if(comp == 1) {
			System.out.println("Oct1 is bigger than oct2.");
		}
		else if(comp == -1) {
			System.out.println("Oct1 is smaller than oct2.");
		}
		else{
			System.out.println("they match!");
		}
	}

}
