import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if(i > 0) {
				if(arr[i - 1] > arr[i])
					break;
			}
		}
	}
}
