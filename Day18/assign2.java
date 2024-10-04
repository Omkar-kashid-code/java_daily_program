import java.util.*;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mass : ");
		double m = sc.nextDouble();
		System.out.println("Enter Velocity : ");
		double v = sc.nextDouble();
		System.out.println("Kinetic energy of the object = "+(m*v*v)/2);
		
	}
}
