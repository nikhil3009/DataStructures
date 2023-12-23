package Arrays.Easy;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int arr[] = {0,2,3,0,5};
        int n = 5;
        moveZeros(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void moveZeros(int[] arr, int n){
        int j = -1;
        for(int i = 0; i<n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }

        }
        static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] =arr[y];
        arr[y] = temp;
        }
    }
