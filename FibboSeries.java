public class FibboSeries {
    public static void main(String[] args) {
        int n=10;
        int fTerm=0;
        int sTerm=1;
        int nextTerm=0;
        System.out.print(fTerm+"  "+sTerm);
        for(int i=1;i<=n;i++)
        {
            nextTerm=fTerm+sTerm;
            System.out.print("  "+nextTerm);
            fTerm=sTerm;
            sTerm=nextTerm;
        }
    }
}
