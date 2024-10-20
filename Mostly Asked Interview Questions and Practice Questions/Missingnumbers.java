import java.util.*;
public class Missingnumbers {
    public static void main(String args[]){
        int arr[]={1,6,0,2,3,7,4};
        int ans=cyclicsort(arr);
        System.out.println("Missing Number is:-"+ans);
    }
    static int cyclicsort(int abc[]){
        int i=0;
        
        while(i<abc.length){
            int correct=abc[i];
            if(correct<abc.length && abc[correct]!=abc[i]){
                swap(abc,correct,i);
            }
            else{
                i++;
            }
        }
        for(i=0;i<abc.length;i++){
            if(abc[i]!=i){
                return i;
            }
        }
        return abc.length;
    }
    static void swap(int abc[],int a,int b){
        int temp=abc[a];
        abc[a]=abc[b];
        abc[b]=temp;
    }
}
