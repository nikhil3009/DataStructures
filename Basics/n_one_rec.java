public class n_one_rec
{
    public static void main(String[] args) {
        int n = 5;
        int i =n;
        printnum(n,i);
    }
    public static void printnum(int n, int i){
        if(i<1){
            return;
        }
        System.out.println(i);
        printnum(n,i-1);
    }
}
