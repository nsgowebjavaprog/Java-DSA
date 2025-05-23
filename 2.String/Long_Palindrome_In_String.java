import java.util.HashMap;

public class Long_Palindrome_In_String {

    public static int long_pali_string(String input) {
        HashMap<Character, Integer> c_map = new HashMap<>();
        int odd_count = 0;

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            c_map.put(ch, c_map.getOrDefault(ch, 0) + 1);

            // Update odd_count based on frequency parity
            if (c_map.get(ch) % 2 == 1) {
                odd_count++;
            } else {
                odd_count--;
            }
        }

        // If more than one odd frequency, we can only keep one odd character in the
        // palindrome center
        if (odd_count > 1) {
            return input.length() - odd_count + 1;
        }

        // If zero or one odd frequency, whole length can be used
        return input.length();
    }

    public static void main(String[] args) {
        String input = "AAAbba";
        System.out.println("RESULT :- " + long_pali_string(input));
    }
}

// For AAAbba:

// Frequencies: A → 3, B → 2, a → 1

// Odd counts = 2 (A and a)

// Only one can be used fully; remove 1 character.

// Output:= 5

// BUT this code gives 5