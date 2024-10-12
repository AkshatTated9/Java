import java.util.Scanner;
public class Stringcharlinearsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String abc=in.nextLine();
        System.out.println("Enter the char you want to search:-");
        char a=in.next().charAt(0);
        int ans=charsearch(abc,a);
        System.out.println("Present at "+ (ans+1) +"th position");
    }
    static int charsearch(String xyz,char y){
        if(xyz.length()==0){
            return -1;
        }
        else{
            for(int i=0;i<xyz.length();i++){
                if(xyz.charAt(i)==y){
                    return i;
                }
            }
            return -1;
        }

    }
}
