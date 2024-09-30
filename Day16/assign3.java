import java.util.*;
class Code{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the current value");
		int current = sc.nextInt();
		System.out.println("enter the resistance value");
		int resistance = sc.nextInt();
		int voltage = current * resistance;
		System.out.println("Output Voltage V "+" = "+voltage);
		
	}
}