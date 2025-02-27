class Search_ele {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int ele = 15;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println(i);
            }
        }
    }
}