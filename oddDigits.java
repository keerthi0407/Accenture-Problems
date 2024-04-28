public class oddDigits {
    public static void main(String[] args) {
        int n=15,c=0;


        for(int i=1;i<=n;i++)
        {
            int digits=(int)(Math.log10(i)+1);
            if(digits%2==1) c++;
        }
        System.out.println(c);
    }
}
