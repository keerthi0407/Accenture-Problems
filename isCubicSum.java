import java.util.*;
public class isCubicSum {
    public static void main(String args[])
    {
        int[] arr={2,9,1};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            //System.out.print((int)Math.cbrt(val)+" ");
            for(int j=1;j<=(int)Math.cbrt(val);j++)
            {
                int res=val-(j*j*j);
                int temp=(int) Math.cbrt(res);
                if(temp*temp*temp == res)
                {
                    System.out.println("val"+val);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
