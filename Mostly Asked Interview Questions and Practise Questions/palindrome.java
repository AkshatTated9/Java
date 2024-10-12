import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to check:");
        String user = in.nextLine();
        in.close();

        int len = user.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (user.charAt(i) != user.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
