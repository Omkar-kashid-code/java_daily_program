import java.util.*;
class Democ{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number1 :");
		int num1 = sc.nextInt();	
		System.out.println("enter  number2 :");
		int num2 = sc.nextInt();	
			if(num1<num2){
				System.out.println("Minimum number amongst "+num1+" & "+num2+" is "+num1);
			}else{
				System.out.println("Minimum number amongst "+num1+" & "+num2+" is "+num2);
			}
		
	}
}