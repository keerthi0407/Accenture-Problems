public class strEui {
    public static void main(String[] args) {
        String s="GBCE";
        long res=0;
        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i)-65;
            //System.out.print("val"+c);
            if(c>6)
            {
                res+=0;
            }
            else{

                res=res+(long)Math.pow(10,c);
                //System.out.print((long)Math.pow(10,c)+" ");
            }
        }
        System.out.println(res);
    }
}
