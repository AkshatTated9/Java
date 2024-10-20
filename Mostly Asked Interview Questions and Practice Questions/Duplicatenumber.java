public class Duplicatenumber {
    public static void main(String args[]) {
        int arr[] = { 1, 6, 5, 2, 5, 7, 4 };

        System.out.println("Duplicate Number is:-" + cyclicsort(arr));
    }

    static int cyclicsort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;

    }

    static void swap(int abc[], int a, int b) {
        int temp = abc[a];
        abc[a] = abc[b];
        abc[b] = temp;
    }
}
