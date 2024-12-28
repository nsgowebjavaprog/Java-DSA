import java.util.*;
import java.io.*;

public class Max_Conti_Ones {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 };
        int max_1 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max_1 = Math.max(max_1, count);
            } else {
                count = 0;
            }
        }
        System.out.println("MAXIMUM NO.OF 1's: " + max_1);
    }
}
// MAXIMUM NO.OF 1's: 7