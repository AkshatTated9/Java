import java.util.Scanner;
import java.util.Arrays;
public class bubblesort {
    public static void main(String args[]){
        int n,temp;
        System.out.println("Enter number of digits:-");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Enter the numbers:-");
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
              
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting in Ascending order: " + Arrays.toString(arr));
    }
}
