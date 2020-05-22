//5.20.2020
//Stephanie Eley
public class Octagon extends GeometricObject implements Cloneable , Comparable {
	
	private double side;
	
	public Octagon(){
		
	}
	public Octagon(double side){
		
	}
	public double getArea() {
		double area =(2 + (4 /Math.sqrt(2)) * side * side);
		return area;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public int compareTo(Object o){
		if(getArea()> ((Octagon) o).getArea()) {
			return 1;
		}
		else if(getArea()< ((Octagon) o).getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (side * 8);
	}
	
}
