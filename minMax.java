public class minMax {
    public static void main(String[] args) {
        int[] arr1={2,4,5,6};
        int[] arr2={1,2,3,4};
        int k=3;
        
        int c1=0,c2=0;
        for(int i=0, j=0;(i<arr1.length ||j<arr2.length);i++,j++)
        {
            if(arr1[i]>k) c1++;
            if(arr2[j]<k) c2++;
        }
        System.out.println(Math.max(c2,c1));
    }
}
