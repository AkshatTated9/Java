import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        int n,x,y,next=0;
        x=0;
        y=1;
        System.out.print("Enter the number of fibonacci numbers you want:-");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.print(x+" "+y);
        for (int i=0;i<n-1;i++){
            next=x+y;
            System.out.print(" "+next);
            x=y;
            y=next;
        }
        System.out.println();
        System.out.print("The "+n+"th fibonacci number is:-"+next);
    }
}
