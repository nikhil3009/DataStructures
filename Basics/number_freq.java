import java.util.HashMap;
public class number_freq
{

        public static void main(String[] args) {
            // precompute
            int[] arr = {6, 5, 4, 3, 2,5,5,5};
            HashMap<Integer, Integer> mpp = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
            }

            // fetch
            int s = 5;
            System.out.println(mpp.getOrDefault(s, 0));
        }
}
