import java.util.*;
class Febonicis{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int count = sc.nextInt();
	int a=0,b=1,c;
	for(int i=1 ; i<=count ; i++){
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		
		}
		
	}
}