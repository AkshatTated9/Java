public class maxwealth {
    public static void main(String args[])
    {
        int arr[][]={
            {1,2,3},{4,5,6},{4,6,5,4}
        };
        int ans=maxwealthclient(arr);
        System.out.print("Richest client balance is :- "+ans);

    }
    static int maxwealthclient(int rr[][]){
        int val=0;
        int maxvalue=0;
        for(int i=0;i<rr.length;i++){
            for(int j=0;j<rr[i].length;j++){
                val=val+rr[i][j];
            }
            if(val>maxvalue){
                maxvalue=val;
            }
            val=0;
        }
        return maxvalue;  
    }
}
