public class missingChar
{
    public static void main(String args[])
    {
        String s="abc";
        int[] res=new int[26];
        for(int i=0;i<s.length();i++)
        {
            res[s.charAt(i)-'a']=1;
        }
        for(int i=0;i<26;i++)
        {
            if(res[i]==0)
            {
                System.out.println((char)(i+97));
                break;
            }
        }
    }
}