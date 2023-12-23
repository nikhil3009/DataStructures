package Arrays.Easy;

public class LeftRotationD
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        int d = 3;
        leftRotate(arr,n,d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] leftRotate(int[] arr, int n,int d){
        d= d%n;
        if(n==0){
            return arr;
        }
        int[] temp = new int[d];
        for(int i =0;i<d;i++){
           temp[i] = arr[i];
        }
        for(int i = 0; i<(n-d);i++){
            arr[i] = arr[i+d];
        }
        for(int i = (n-d);i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
        return arr;
    }

}
