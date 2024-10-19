class Demo {
	public static void main(String[] args) {
		int num;
		for(int i = 0; i < 4; i++) {
			num = 7 - i;
			for(int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println();
		}
	}
}