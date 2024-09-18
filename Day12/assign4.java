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
		if(sym== '+'){
		int addition = num1 + num2;
		System.out.println("Addition of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+addition);
		}
		if(sym== '-'){
		int substraction = num1 - num2;
		System.out.println("Substraction of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+substraction);
                }
		if(sym== '*'){
		int multiplication = num1 * num2;
		System.out.println("Multiplication of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+multiplication);
		}
		if(sym== '/'){
		int division = num1 / num2;
		System.out.println("Division of"+" "+num1+" "+"&"+" "+num2+" "+"is"+" "+division);
                }
	}


}