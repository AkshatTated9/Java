import java.util.*;
public class MissingandDuplicatenumber {
    public static void main(String args[]){
        int arr[]={1,6,3,3,6,4};
        
        System.out.println("Duplicate Number and missing number is:-"+Arrays.toString(cyclicsort(arr)));
    }
    static int[] cyclicsort(int abc[]){
        int i=0;
        int ans[]={-1,-1};
        while(i<abc.length){
            int correct=abc[i]-1;
            if( abc[correct]!=abc[i]){
                swap(abc,correct,i);
            }
            else{
                i++;
            }
        }
        
        for(i=0;i<abc.length;i++){
            if(abc[i]!=i+1){
                ans[0]=abc[i];
                ans[1]=i+1;
            }
        }
        return ans;
        
        
    }
    static void swap(int abc[],int a,int b){
        int temp=abc[a];
        abc[a]=abc[b];
        abc[b]=temp;
    }
}
