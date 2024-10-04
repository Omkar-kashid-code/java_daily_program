import java.util.*;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.println("before swap = "+num1+" "+num2);
		int temp = num1 ;
		num1 = num2;
		num2=temp;
		
		System.out.println("After swap = "+num1+" "+num2);
	}
}
