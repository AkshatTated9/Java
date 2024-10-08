import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().trim().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
