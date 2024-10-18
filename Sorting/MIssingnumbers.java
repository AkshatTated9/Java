public class MIssingnumbers {
    public static void main(String args[]) {
        int arr[] = { 1, 6, 0, 2, 3, 5 };
        int ans = cyclicsort(arr);
        System.out.println(ans);
    }

    static int cyclicsort(int abc[]) {
        int i = 0;
        while (i < abc.length) {
            int correct = abc[i];
            if (abc[i] < abc.length && abc[correct] != abc[i]) {
                swap(abc, correct, i);
            } else {
                i++;
            }
        }
        for (int index = 0; index < abc.length; index++) {
            if (abc[index] != index) {
                return index;
            }
        }
        return abc.length;

    }

    static void swap(int abc[], int a, int b) {
        int temp = abc[a];
        abc[a] = abc[b];
        abc[b] = temp;
    }
}
