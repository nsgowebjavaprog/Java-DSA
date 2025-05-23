import java.util.Arrays;

public class Left_Rotate_By_1_Place {
    
    public static void leftRotate(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Array before left rotation: " + Arrays.toString(arr));
        
        leftRotate(arr);  // Rotate by 1 place left

        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }
}
