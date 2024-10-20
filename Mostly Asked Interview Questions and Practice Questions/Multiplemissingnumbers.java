import java.util.*;
public class Multiplemissingnumbers {
    public static void main(String args[]){
        int arr[]={1,6,0,2,0,7,4};
        
        System.out.println("Missing Number is:-"+cyclicsort(arr));
    }
    static List <Integer> cyclicsort(int abc[]){
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
        List <Integer> ans=new ArrayList<>();
        for(i=0;i<abc.length;i++){
            if(abc[i]!=i){
                ans.add(i);
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
