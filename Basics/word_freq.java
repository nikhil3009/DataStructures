import java.util.HashMap;
public class word_freq
{
    public static void main(String[] args) {
        char[] arr = {'a','e','i','o','u','z','f','a'};
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }

        char s = 'a';
        System.out.println(mpp.getOrDefault(s,0));

    }

}
