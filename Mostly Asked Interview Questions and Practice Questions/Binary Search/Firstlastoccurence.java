import java.util.*;
public class Firstlastoccurence {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,5,6,7};
        int target=3;
        boolean firstoccurence=true;
        int start=findnumber(arr,target,firstoccurence);   
        int end=findnumber(arr,target,firstoccurence=false);
        int ans[]={-1,-1};
        ans[0]=start;
        ans[1]=end;
        System.out.println(Arrays.toString(ans));
    }
    static int findnumber(int abc[],int a,boolean gh){
        int res=-1;
        int start = 0;
        int end = abc.length - 1;

        while (start <= end) {
            int mid = start + (end - start);
        
            if (a < abc[mid]) {
                end = mid - 1;
            } else if (a > abc[mid]) {
                start = mid + 1;
            }
            else{
                res=mid;
                if(gh==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }return res;
    }
    }

