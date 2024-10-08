import java.util.Scanner;

public class binarysearchrecursive {
    public static int binarysearch(int array[],int low,int high , int number){
        if (low <= high) {
            int middle = (low + high) / 2;

            // If the element is found
            if (array[middle] == number) {
                return middle; // return the index
            }

            // If the element is smaller than the middle element, search the left subarray
            if (array[middle] > number) {
                return binarysearch(array, low, middle - 1, number);
            }

            // Otherwise, search the right subarray
            return binarysearch(array, middle + 1, high, number);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, number;

        System.out.println("Enter Number of elements");
        n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements (in sorted order)");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Enter the Number You want to search:");
        number = in.nextInt();

        int result = binarysearch(array, 0, n - 1, number);

        if (result != -1) {
            System.out.println("Element found at position: " + (result + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}
