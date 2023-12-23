public class Factors {
    public static void main(String[] args){
        System.out.println(factor(10));
    }
    public static int factor(int n){
        int count = 0;
        for(int i = 1; i*i<=n;i++){
            if(n%i == 0){
                if(i*i == n){
                    count = count+1;
                }
                else{
                    count = count+2;
                }
            }
        }
        return count;
    }
}
