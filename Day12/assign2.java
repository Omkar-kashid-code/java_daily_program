import java.util.*;
class Cemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		int num1 =sc.nextInt();
		System.out.println("enter a second number");
		int num2 =sc.nextInt();
		int multiplication =num1 * num2;
		System.out.println("Multiplication is ="+ multiplication);
		int division =num1 / num2;
		if(num1>num2){
			System.out.println("Division is ="+ division);
		}else{
			System.out.println("Error");
			}
		}
}
