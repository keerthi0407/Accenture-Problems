//return the absolute least difference from the array with th given element

public class leastdiff {
    public static int diff(int[] arr,int n,int k)
    {
        int min=Integer.MAX_VALUE,ele=0;
        for(int a: arr)
        {
           
            if(Math.abs(k-a)<ele) 
            
            {
                
                ele=Math.abs(k-a);
                min=a;
                System.out.println(min);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={1,2,12,13 ,15 ,17 ,26 ,30,38,45,64,72};
        System.out.println("va "+diff(arr,arr.length,27));
    }
}
