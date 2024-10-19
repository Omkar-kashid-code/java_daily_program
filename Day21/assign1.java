import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check the prime number");
	boolean prime = true;
	int n = sc.nextInt();
	for(int i = 2 ; i<n ; i++){
		if(n%i==0){
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}
}