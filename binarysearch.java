import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int low,high,middle,array[],n,number;
        System.out.println("Enter Number of elements");
        n=in.nextInt();
        array=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter the Number You want to search:-");
        number=in.nextInt();
        low=0;
        high=n-1;
        while(low<=high){
            middle=(low+high)/2;
            if(array[middle]<number){
                low=middle+1;
            }
            else if(array[middle]==number){
                System.out.println("Element found at :-"+(middle+1));
                break;
            }
            else{
                high=middle-1;
            }
        }
        if(low>high){
            System.out.println("Element Not Found");
        }

    }
    

}
