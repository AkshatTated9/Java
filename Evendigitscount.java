// Leetcode 1295 Question

public class Evendigitscount {
    public static void main(String args[]){
        int arr[]={15,36,444,8888,777,1526};
        int ans=findnumbers(arr);
        System.out.print("Number of digits containing even numbers:-"+ans);
    }
    static int findnumbers(int num[]){
        int result=0;
        for(int i=0;i<num.length;i++){
            if(evena(num[i])){
                result++;
            }
        }
        return result;
    }
    static boolean evena(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return (count%2==0);
    }
}
