import java.util.ArrayList;
import java.util.List;

public class Long_Incre_Sub_Seq {

    public static int sub_seq(int arr[]) {

        List<Integer> res = new ArrayList<>();

        for (int i : arr) {
            if (res.isEmpty() || res.get(res.size() - 1) < i) {
                res.add(i);
            } else {
                int idx = bin_search(res, i);
                res.set(idx, i);
            }
        }
        return res.size();
    }

    private static int bin_search(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr.get(mid) == target)
                return mid;

            else if (arr.get(mid) > target)
                right = mid - 1;

            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println(sub_seq(arr));
    }
}