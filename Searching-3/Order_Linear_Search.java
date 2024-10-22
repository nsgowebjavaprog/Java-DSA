public class Order_Linear_Search {
    public static int orderLinearsearch(int arr[], int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return i;

            else if (arr[i] > data)
                return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 9, 12 };// --------------->// 2
        int res = orderLinearsearch(arr, 4);// --------------->TC :O(N)
        System.out.println(res);
    }
}
