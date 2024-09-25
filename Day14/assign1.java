import java.util.*;
class codex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a minimum number:");
		int min = sc.nextInt();
		System.out.println("enter a maximum number:");
		int max = sc.nextInt();
		System.out.println("Series of Odd number ranging between "+ min +" & "+ max+ " is : ");
		for(int i=min;i<=max;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}

	}
}