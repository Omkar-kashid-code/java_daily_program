import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		int num1 =sc.nextInt();
		System.out.println("enter a second number");
		int num2 =sc.nextInt();
		int addition =num1 + num2;
		System.out.println("Addition is"+ addition);
		int substraction =num1-num2;
		if(num1>num2){
			System.out.println("Substraction is"+ substraction);
		}else{
			System.out.println("Error");
			}
		
	}
}