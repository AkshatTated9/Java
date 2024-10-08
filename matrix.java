import java.util.Scanner;
class matrix{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows & columns:-");
        int m=in.nextInt();
        int n=in.nextInt();
        int first [][]=new int [m][n];
        int second[][]=new int [m][n];
        int sum[][]=new int [m][n];
        System.out.println("Enter the elements of the first matrix:-");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                first[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:-");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                second[i][j]=in.nextInt();
            }
        }
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                sum[i][j]=first[i][j]+second[i][j];
            }
        }
        System.out.println("Sum of matrix:-");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

    }
}