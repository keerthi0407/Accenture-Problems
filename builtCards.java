public class builtCards {
    public static void main(String[] args) {
        int n=3,res=0;
        for(int i=n-1;i>=0;i--)
        {
            res+=(3*i+2);
        }
        System.out.println(res);
    }
}
//3*(n*(n-1)/2)*n