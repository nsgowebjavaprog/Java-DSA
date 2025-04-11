public class Sum_posivite_num {

    public static int only_positive_numbers_other_wise_sum_is_zero(int initial_health, int[] health_range) {
        // int sum = 0;
        // for (int i : health_range) {
        // sum = initial_health + i;
        // }
        // if (sum <= 0) {
        // sum = 0;
        // }
        // return sum;

        int health = initial_health;
        for (int i : health_range) {
            health += i;

            if (health <= 0) {
                health = 0;
            }
        }
        return health;
    }

    public static void main(String[] args) {
        int health_range[] = { 3, 6, -6, 7 };
        int initial_health = 21;
        System.out.println(only_positive_numbers_other_wise_sum_is_zero(initial_health, health_range)); // op ==> 31
    }
}

// initial_health + arr[0] --> sum > 0 else again sum = 0[if sum is -ve]
// initial_health + arr[1] --> sum > 0 else again sum = 0[if sum is -ve]
// initial_health + arr[2] --> sum > 0 else again sum = 0[if sum is -ve]
// initial_health + arr[3] --> sum > 0 else again sum = 0[if sum is -ve]