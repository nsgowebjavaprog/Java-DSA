//Remove duplicate from sorted array 

public class Remove_Duplicates {
    public static int remove_dubplicate(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }; // 5
        int res = remove_dubplicate(arr);
        System.out.println(res);
    }
}
// TC : O(N)