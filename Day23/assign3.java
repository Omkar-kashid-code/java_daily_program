import java.util.*;
class Demo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value ");
	int a = sc.nextInt();
	for(int i=1;i<=a;i++){
		if(i%2==0){
			continue;
			}
			System.out.println(i);
		}
	}
}