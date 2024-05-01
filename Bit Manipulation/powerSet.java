//power set is used to get all subsequences from array tc-2^n *n sc-n*2^n
import java.util.*;
public class powerSet {
    public static void power(int c,List<Integer> list,int[] arr )
    {
        if(c>=arr.length)
        {
            for(int i=0;i<list.size();i++)
            System.out.print(list.get(i));
            System.out.println();
            return ;
        }
        list.add(arr[c]);
        power(c+1,list,arr);
        list.remove(list.size()-1);
        power(c+1,list,arr);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
       // int n=arr.length;
       // System.out.println(2 &(1<<1));
        /*for(int i=0;i<(1<<n);i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                //System.out.println((i &(1<<i)));
                if((i &(1<<j))>0) list.add(arr[j]);
            }
            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k)+" ");
            }
            System.out.println();
        }*/
        List<Integer> list=new ArrayList<>();
        power(0,list,arr);

    }
}
