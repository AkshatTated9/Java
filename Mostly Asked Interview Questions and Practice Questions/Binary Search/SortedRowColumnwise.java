import java.util.*;
public class SortedRowColumnwise {
    public static void main(String args[]){
        int arr[][]={
            {11,22,33,44},
            {13,23,35,46},
            {18,25,37,49},
            {21,29,40,53}
        };
        System.out.println(Arrays.deepToString(arr));
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
        in.close();
    }
    static int[] search(int abc[][],int target){
        int row=0;
        int col=abc.length-1;
        while(row<=abc.length-1 && col>=0){
            if(abc[row][col]==target){
                return new int[]{row,col};
            }
            if(target>abc[row][col]){
                row++;
            }
            else{
                col--;
            }
        }return new int[]{-1, -1};
    }
}
