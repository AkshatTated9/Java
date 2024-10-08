/*
import java.util.Scanner;
public class evenodd { public static void main(String args[])
    {
        int n;
        System.out.println("Enter the number you want to check:-");
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        if(n%2==0){
          } 
        else{
            System.out.println("Odd");
        }

    }
}
*/

import java.util.Scanner;

public class evenodd {
    public static void main(String args[]) {
        int n;
        System.out.println("Enter the number you want to check:-");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n / 2 * 2 == n) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}