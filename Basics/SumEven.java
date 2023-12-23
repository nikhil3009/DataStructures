public class SumEven
{
    public static void main(String[] args) {
        System.out.println(sumEven(5));

    }
    public static int sumEven(int a){
        int sum = 0;
        for(int i=1; i<=a;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
