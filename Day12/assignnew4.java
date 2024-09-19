import java.util.*;
class Codex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		int num1 = sc.nextInt();
		System.out.println("enter a second number");
		int num2 = sc.nextInt();
		System.out.println("enter the sign of Operation");
		char sym = sc.next().charAt(0);
		switch(sym){
			case '+':
			System.out.println("Addition of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+(num1+num2));
			break;
			case '-':
			System.out.println("Substraction of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+(num1-num2));
			break;
			case '*':
			System.out.println("Multiplication of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+(num1*num2));
			break;
			case '/':
			System.out.println("Division of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+(num1/num2));
			break;
			default:
			System.out.println("Invalid operation")	;

		}
	}


}