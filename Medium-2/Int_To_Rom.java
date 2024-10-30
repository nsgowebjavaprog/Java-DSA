public class Int_To_Rom {
    public String convertToRoman(int n) {
        if (n < 1 || n > 3999) {
            return "Invalid Roman Number Value";
        }

        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thousands = m[n / 1000];
        String hundreds = c[(n % 1000) / 100];
        String tens = x[(n % 100) / 10];
        String ones = i[n % 10];

        String ans = thousands + hundreds + tens + ones;
        return ans;
    }

    public static void main(String[] args) {
        Int_To_Rom converter = new Int_To_Rom();
        int number = 2024;
        String roman = converter.convertToRoman(number);
        System.out.println("Integer: " + number);
        System.out.println("Roman Numeral: " + roman);
    }
}
