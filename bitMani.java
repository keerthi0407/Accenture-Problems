//get and of a array eelemnts if res=0 thwn fips=0 else return the no of fips to make res =0
public class bitMani
{
    public static void main(String args[])
    {
        int[] arr={4,4,4};
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res=res&arr[i];
            //System.out.print(res);
        }
        int one=0;
        /*String va=Integer.toBinaryString(res);
        int one=0;
        for(int i=0;i<va.length();i++)
        {
            if(va.charAt(i)=='1') one++;
        }*/
        
        while(res!=0)
        {
            if((res & 1 )==1) one++;
            res=res>>1;
        }
        System.out.println(one);
    }
}