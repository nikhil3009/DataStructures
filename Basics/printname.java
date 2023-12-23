public class printname
{
    public static void main(String[] args) {
        int n =5;
        printName(n,1);
    }
    public static void printName(int n, int count){
        if(count>n){
            return;
        }
        System.out.println("SaiNikhil");
        count++;
        printName(n, count);
    }
}
