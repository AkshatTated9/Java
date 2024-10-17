import java.util.*;
public class Selectionsort {
    public static void main(String args[]){
        int arr[]={1,5,2,3,7};
        selectionsort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selectionsort(int abc[]){
            for(int i=0;i<abc.length;i++){
                int last=abc.length-i-1;
                int a=maxelement(abc,0,last);
                swapelements(abc,a,last);
            }
            
    }
    static int maxelement(int abc[],int start,int end){
        int maxind=start;
        for(int i=start;i<=end;i++){
            if(abc[maxind]<abc[i]){
                maxind=i;
            }
        }
        return maxind;
    }
    static void swapelements(int arr[],int a,int end){
        int temp=arr[end];
        arr[end]=arr[a];
        arr[a]=temp;
        end--;
        
    }

    
}
