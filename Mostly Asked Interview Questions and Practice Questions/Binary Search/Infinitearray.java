public class Infinitearray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target=9;
        int start=0;
        int end=1;
        while(arr[end]<target){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        int ans=findnumber(arr,target,start,end);
        System.out.print("Found at index:-"+ans);
    }
    static int findnumber(int abc[],int a,int s,int e){
        while (s<= e) {
            int mid = s + (e - s)/2;
            if(abc[mid]==a){
                return mid;
            }
            else if (a < abc[mid]) {
                e = mid - 1;
            } else if (a > abc[mid]) {
                s = mid + 1;
            }
        }return -1;
    }
}
