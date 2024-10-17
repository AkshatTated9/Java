import java.util.*;
public class Insertionsort {
    public static void main(String args[]){
        int arr[]={4,-7,1,8,9};
        Sortnumbers(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sortnumbers(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int arr[],int j,int a){
        int temp=arr[j];
        arr[j]=arr[a];
        arr[a]=temp;
    }
}
