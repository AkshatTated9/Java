import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        int n, temp, remainder, digits = 0;
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = in.nextInt();
        in.close();
        
        // Find the number of digits
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Reset temp to original value of n
        temp = n;
        
        // Calculate the sum of the digits raised to the power of 'digits'
        while (temp > 0) {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp = temp / 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
