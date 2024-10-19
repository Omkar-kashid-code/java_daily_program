import java.util.*;
class Code{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number limit to check for prefect number :");
		int limit = sc.nextInt();	
		for (int num=1;num<=limit;num++ ){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum = sum+i;
			}
		}
		if(num == sum){
			System.out.println(num);
		}
		}

	}

}