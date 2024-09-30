import java.util.*;
class Code{
	public static void main (String[] args){
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number to check for prefect number :");
		int num = sc.nextInt();	
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum = sum+i;
			}
		}
		if(num == sum){
			System.out.println("Perfect number");
		}else{

		System.out.println("Not Perfect number");
		}
	}
}