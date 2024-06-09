package Maths;

public class Palindrom {
    public static void main(String[] args) {
        String s = "asdgfdsa";
        int i=0, j=s.length()-1;
        while (i<j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
