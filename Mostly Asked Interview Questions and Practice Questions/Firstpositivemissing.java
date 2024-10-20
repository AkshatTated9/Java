import java.util.*;
public class Firstpositivemissing {
    public static void main(String args[]){
        int arr[]={3,4,-1,1};
        int ans=cyclicsort(arr);
        System.out.println("First Missing Number is:-"+ans);
    }
    static int cyclicsort(int abc[]){
        int i=0;
        
        while(i<abc.length){
            int correct=abc[i]-1;
            if(abc[i]>0 && abc[i]<=abc.length && abc[correct]!=abc[i]){
                swap(abc,correct,i);
            }
            else{
                i++;
            }
        }
        for(i=0;i<abc.length;i++){
            if(abc[i]!=i+1){
                return i+1;
            }
        }
        return abc.length+1;
    }
    static void swap(int abc[],int a,int b){
        int temp=abc[a];
        abc[a]=abc[b];
        abc[b]=temp;
    }
}
