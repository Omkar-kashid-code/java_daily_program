class Demo {
	public static void main(String[] args) {
		int inc;
		for(int i = 0; i < 4; i++) {
			inc = 0;
			for(int j = 0; j < 4; j++) {
				if(j < 3 - i) {
					System.out.print("  ");
				}
				else {
					System.out.print((char)(65 + inc)+ " "); 
					inc++;
				}
			}
			System.out.println();
		}
	}
}
