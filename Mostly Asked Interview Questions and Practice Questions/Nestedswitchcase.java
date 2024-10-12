import java.util.Scanner;
public class Nestedswitchcase {
    public static void main(String args[]){
        System.out.println("Enter the Emp Id:-");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the Emp Department:-");
        String s=in.next();
        in.close();
        switch(n){
            case 1:
                System.out.println("Jai shree ram");
                break;

            case 4:
            {
                switch(s){
                    case "IT" -> System.out.print("Naman");
                    case "Civil" -> System.out.print("Jiya");
                }
                break;
            }
            default: {
                System.out.println("Error");
            }
        }




        
    }
}
