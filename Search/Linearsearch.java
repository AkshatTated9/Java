import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array:- ");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the elements:-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element you want to search:-");
        int target=in.nextInt();
        int ans=linearsearchtarget(arr,target);
        System.out.println(ans);
        
    }
    static int linearsearchtarget(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        else{
            for(int j=0;j<arr.length;j++){
                if(arr[j]==target){
                    return j;
                }
            }
            return -1;
        }
    }
}
