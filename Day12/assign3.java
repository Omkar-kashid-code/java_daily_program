import java.util.*;
class Codex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		int num1 = sc.nextInt();
		System.out.println("enter a second number");
		int num2 = sc.nextInt();
		int cube1 = num1*num1*num1;
		int cube2 = num2*num2*num2;
		int addition = cube1 + cube2;
		System.out.println("Addition of"+" "+cube1+" "+"&"+" "+cube2+" "+"is"+" "+addition);
		int sq1 = num1*num1;
		int sq2 = num2*num2;
		int substraction = sq1 - sq2;
		System.out.println("Substraction of"+" "+sq1+" "+"&"+" "+sq2+" "+"is"+" "+substraction);

		
	}
}
