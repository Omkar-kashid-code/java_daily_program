class Codex {
    public static void main(String[] args) {
        int n = 5; 
        int num;

        for (int i = n; i >= 1; i--) {
            num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
  