import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date : ");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		if((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d > 0 && d <= 31) && y >= 0) {
			System.out.println("Vaiid date");
		} else if((m == 4 || m == 6 || m == 9 || m == 11) && (d > 0 && d <= 30) && y >= 0){
			System.out.println("valid date");
		} else if(m == 2 && y >= 0) {
			if(y % 100 == 0) {
				if(y % 400 == 0) {
					if(d > 0 && d <= 29) {
						System.out.println("valid date");
					} else {
						System.out.println("Invalid date");
					}
				} else {
					if(d > 0 && d <= 28) {
						System.out.println("Valid date");
					} else {
						System.out.println("Invalid date");
					}
				}
			} else if(y % 4 == 0) {
				if(d > 0 && d <= 29) {
					System.out.println("valid date");
				} else {
					System.out.println("Invalid date");
				}	
			} else if(d > 0 && d <= 28) {
				System.out.println("valid date");
			} else {
				System.out.println("Invalid date");
			}

		} else {
			System.out.println("Invalid");
		}
	}
}
