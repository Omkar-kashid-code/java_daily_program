import java.util.*;
class Democ{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter minimum number :");
		int min = sc.nextInt();	
		System.out.println("enter maximum number :");
		int max = sc.nextInt();	
		for(int i =min;i<=max;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}