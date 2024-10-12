import java.util.Scanner;
public class celciustofarenite
{
    public static void main(String[] args) {
        float f,n;
        System.out.println("Enter the Celcius Temperature:-");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f=n*9/5+32;
        System.out.println(f);
    }
}