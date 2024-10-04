import java.util.*;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.println("Quotient = "+num1/num2);
		System.out.println("remainder = "+num1%num2);
	}
}