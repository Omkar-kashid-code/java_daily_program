import java.util.*;
class ReverseArray{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array ");
	int size = sc.nextInt();
	System.out.println("enter array element");
	int[] arr = new int[size];
	for(int i = 0 ; i<size ; i++){
		arr[i]=sc.nextInt();
		}
	for(int i =arr.length - 1;i>=0 ; i--){
		System.out.println("Reverse element are = "+arr[i]);
		}
		
	}
}