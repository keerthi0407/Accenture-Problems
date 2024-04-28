public class maxProd {
    public static void main(String[] args) {
        int l1=1,r1=3,l2=-2,r2=6;
        System.out.println(Math.max((l1*l2),Math.max((l1*r1),Math.max((r1*r2),(r2*l1)))));
    }
}
