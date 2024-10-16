public class Mountainproblem {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,4,3,2,1};
        int ans=findnumber(arr);
        System.out.print("Index is:-"+ans);
    }
    static int findnumber(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }return end;
    }
}
