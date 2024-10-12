import java.util.Arrays;
import java.util.Scanner;

public class CeilingNumber {
    public static void main(String[] args) {
        int arr[] = { 9,10,14,16,19,50};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target alement:-");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = locate(arr, target);
        System.out.println("Number is present at :-" + ans + " index");
    }

    static int locate(int ar[], int num) {
        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {
            int mid = start + (end - start);
            if (ar[mid] == num) {
                return mid;
            }

            else if (num < ar[mid]) {
                end = mid - 1;
            } else if (num > ar[mid]) {
                start = mid + 1;
            }

        }
        return start;
    }

}