class greatx{
    public static void main(String[] args) {
    
        double percentage = 85.0;

        char grade;
        if (percentage >= 90 && percentage <= 100) {
            grade = 'A';
        } else if (percentage >= 80 && percentage < 90) {
            grade = 'B';
        } else if (percentage >= 70 && percentage < 80) {
            grade = 'C';
        } else if (percentage >= 60 && percentage < 70) {
            grade = 'D';
        } else if (percentage >= 0 && percentage < 60) {
            grade = 'F';
        } else {
            grade = 'I';
        }

        if (grade == 'I') {
            System.out.println("Invalid percentage");
        } else {
            System.out.println("The grade is: " + grade);
        }
    }
}