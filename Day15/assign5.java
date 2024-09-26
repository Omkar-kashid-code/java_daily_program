import java.util.*;
class Democ{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number1 :");
		int num1 = sc.nextInt();	
		System.out.println("enter  number2 :");
		int num2 = sc.nextInt();
		System.out.println("enter  number3 :");
		int num3 = sc.nextInt();	
			if(num1>num2 && num1>num3){
				System.out.println("Maximum number amongst "+num1+" & "+num2+" & "+num3+" is "+num1);
			}else if(num2>num1 && num2>num3){
				System.out.println("Maximum number amongst "+num1+" & "+num2+" & "+num3+" is "+num2);
			}else{
				System.out.println("Maximum number amongst "+num1+" & "+num2+" & "+num3+" is "+num3);
				}	
		
	}
}