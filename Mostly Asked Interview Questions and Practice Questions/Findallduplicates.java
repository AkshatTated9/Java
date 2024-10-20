import java.util.ArrayList;
import java.util.List;

public class Findallduplicates {
    public static void main(String args[]){
        int arr[]={1,6,3,3,6,4};
        
        System.out.println("Duplicates Number is:-"+cyclicsort(arr));
    }
    static List <Integer> cyclicsort(int abc[]){
        int i=0;
        while(i<abc.length){
            int correct=abc[i]-1;
            if( abc[correct]!=abc[i]){
                swap(abc,correct,i);
            }
            else{
                i++;
            }
        }
        List <Integer> ans=new ArrayList<>();
        for(i=0;i<abc.length;i++){
            if(abc[i]!=i+1){
                ans.add(abc[i]);
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
