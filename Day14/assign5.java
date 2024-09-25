import java.util.*;
class codex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		if(num1>num2){
			System.out.println("The Maximum number amongst "+num1+" & "+num2+" is : "+num1 );
		}else{
			System.out.println("The Maximum number amongst "+num1+" & "+num2+" is : "+num2 );
		}
	}
}