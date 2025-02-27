public class Array_To_Method {

    public static void printArray(int[] arr) {
        arr[1] = 100;
    }

    public static void main(String[] args) {
        int org_arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(org_arr[1]);
        printArray(org_arr);
        System.out.println(org_arr[1]);
    }

}
