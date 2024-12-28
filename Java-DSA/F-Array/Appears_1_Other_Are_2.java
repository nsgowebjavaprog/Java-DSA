/*
 * public class Appears_1_Other_Are_2 {
 * public static void main(String[] args) {
 * int arr[] = {1,1,2,2,3,4,4,5,5,6,6,7,7,8,8,9,9};
 * 
 * for (int i = 0; i < arr.length; i++) {
 * int num = arr[i];
 * int count= 0;
 * for (int j = 0; j < arr.length; j++) {
 * if(arr[j] == num){
 * count++;
 * }
 * }if(count == 1){
 * System.out.println(num); // 3
 * }
 * }
 * 
 * }
 * }
 * 
 */

// ---------------------2 o{n}

public class Appears_1_Other_Are_2 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };

        int XOR = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        System.out.println(XOR);
    }
}