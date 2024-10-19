import java.util.*;
class ArrayProgram {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = sc.nextInt();
	System.out.println("enter the array element");
	int[] arr = new int[size];
	for(int i=0;i<size;i++){
		arr[i] = sc.nextInt();
		}
	int sum = 0;
	for(int i = 0 ; i<arr.length ; i++){
		sum = sum + arr[i];
		}
		System.out.println("sum is "+sum);
	}
}