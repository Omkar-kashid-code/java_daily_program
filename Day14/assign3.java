import java.util.*;
class codex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number:");
		int num1 = sc.nextInt();
		for(int i = 0 ; i<=num1 ; i++){
			if(i%2==0){
				System.out.println("Cube of " + i + " : " +(i*i*i)+ " and "+" Square of"+ i + " : " +(i*i));
			}
		} 
	}
}