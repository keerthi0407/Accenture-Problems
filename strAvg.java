public class strAvg
{
    public static void main(String args[])
    {
        String s="source";
        double val=0;
        for(int i=0;i<s.length();i++)
        {
            val+=s.charAt(i);
        }
        val=val/s.length();
        System.out.printf("%.2f",val);
    }
}