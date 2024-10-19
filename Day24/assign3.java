import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		int num, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		while(i < 10) {
			num = sc.nextInt();
			if(num < 0)
				break;
			i++;
		}
	}
}
