class Demo {
    public static void main(String[] args) {
        char x= 'a'; 
        for (int i = 0; i < 4; i++) {
            char y = ((char) (x + 2 * i)); 
            for (int j = i; j < 4; j++) {
                System.out.print(y + " ");
                y++;
            }
            System.out.println();  
        }
    }
}
