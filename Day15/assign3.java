import java.util.*;
class Democ{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance :");
		int dist = sc.nextInt();	
		System.out.println("Enter Time :");
		int time = sc.nextInt();	
		int speed = dist/time;
		System.out.println("Speed is "+speed);
	}
}