public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    public static int power(int a, int b){
        if(a==1){
            return 1;
        }
        if(b==1){
            return a;
        }
        int ans=1;
        for(int i=1; i<=b;i++){
            ans=a*ans;
        }
        return ans;
    }
}
