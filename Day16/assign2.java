import java.util.*;
class Factorial{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting integer");
		int start = sc.nextInt();
		System.out.println("enter the ending integer");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++){
			int factorial=1;
			for(int j =1;j<=i;j++){
				factorial=factorial*j;
			}
		System.out.println("Factorial of "+i+" = "+factorial);
		
		}

	}
}