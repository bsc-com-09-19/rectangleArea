import java.util.Scanner;
public class rectangleArea{

	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("The area will be shown here.");
		System.out.println("Enter length and breadth: ");
		double length = input.nextDouble();
                double breadth= input.nextDouble();
                Area area1 = new Area(length,breath);
                System.out.println("The area is " + area1.returnArea());
	
	

	}	
}
class Area{
	double length, breadth, area;

	Area(double l, double b){
		length =l;
		breadth =b;
	}
	public double returnArea(){
		area = length * breadth;
		return area;
	}

}