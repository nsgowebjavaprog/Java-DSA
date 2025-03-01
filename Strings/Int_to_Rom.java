
public class Int_to_Rom {
    public static void main(String[] args) {
        int num = 2024;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {

        int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String romans[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder rom_res = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            // 2024 >= 1000 | 1024>1000 | 24>=10 | 14>= 10 | 4>= 4
            while (num >= values[i]) {
                // [M] + [M] + [x] +[X] +[IV]
                rom_res.append(romans[i]);
                // 2024-1000 = 1024 | 1024-1000 = 24 | 24-10=14 | 14-10=4 | 4-4 = 0
                num = num - values[i];
            }
        }
        return rom_res.toString(); // MMXXIV ===> 2024
    }
}
