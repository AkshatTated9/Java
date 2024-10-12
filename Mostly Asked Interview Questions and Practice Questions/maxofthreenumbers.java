import java.util.Scanner;
public class maxofthreenumbers {
    public static void main(String args[]){
        int a,b,c;
        int max=0;
        System.out.println("Enter three numbers:-");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        
        max=a;
        if(max<b){
            max=b;
        }

        if(max<c){
            max=c;
        }
        System.out.println("Maximum number is :-"+max);

        //Alternative Method
        // max=Math.max(c,Math.max(a,b));
        // System.out.println("Maximum number is :-"+max);
    }
}
