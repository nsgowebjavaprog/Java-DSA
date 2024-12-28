public class Rev_Arr {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int first = i;
            int last = n - 1 - i;

            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
        }
        System.out.print("Rev- Arr: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
// Rev- Arr: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10,