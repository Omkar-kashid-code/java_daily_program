class Demo {
    
    public static void main(String[] args) {
       
        for (int number = 2; number <= 100; number++) {
            int count = 0; 
              for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++; 
                    break;   
                }
            }
            if (count == 0) {
                System.out.println(number);
            }
        }
    }
}