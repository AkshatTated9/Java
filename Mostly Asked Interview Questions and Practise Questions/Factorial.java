import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        int n,sum=1;
        System.out.println("Enter the Number for which you want to get factorial:-");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        while(n>0){
            sum*=n;
            n--;
        }
        System.out.println(sum);
    }
}
