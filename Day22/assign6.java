import java.util.Scanner;

class Demon {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {1, 2, 3, 4, 5};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Iterate through the array to check if the value exists
        for (int element : arr) {
            if (element == target) {
                found = true;
                break; // Value found, exit the loop
            }
        }

        // Print the result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        // Close the scanner
        scanner.close();
    }
}
