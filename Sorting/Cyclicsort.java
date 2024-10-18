import java.util.*;
public class Cyclicsort {
    public static void main(String args[]){
        int arr[]={1,6,4,2,3,5};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int abc[]){
        int i=0;
        
        while(i<abc.length){
            int correct=abc[i]-1;
            if(abc[correct]!=abc[i]){
                swap(abc,correct,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int abc[],int a,int b){
        int temp=abc[a];
        abc[a]=abc[b];
        abc[b]=temp;
    }
}
