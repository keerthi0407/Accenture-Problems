//return leaders sum in an array
public class leaderSum {
    public static int leadersum(int[] arr, int n)
    {
        if(n==0) return -1;
        int max=arr[arr.length-1],sum=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                sum+=arr[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr={52,66,64,36,45,24,32};
        
        System.out.println(leadersum(arr,arr.length));
    }
}
