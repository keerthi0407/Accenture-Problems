//print the index f max eement and element in an aray.
public class maxArray {
    public static void main(String[] args) {
        int max=0,ind=0;
        int[] arr={5,8,1,4};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ind=i;
            }
        }
        System.out.println(max+" "+ind);
    }
}
