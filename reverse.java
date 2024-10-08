import java.util.Scanner;
public class reverse {
    public static void main(String args[])
    {
        int n,result=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number you want to reverse:-");
        n=in.nextInt();
        System.out.println("Original Number:-"+n);
        while(n>0){
          result=result*10+n%10;
          n=n/10;  
        }
        System.out.println("Reverse Number:-"+result);

    }
}
