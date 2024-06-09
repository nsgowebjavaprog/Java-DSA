package Maths;

public class Power_of_2 {
    public static void main(String[] args) {
        boolean a = false;
        int num = 32,power = 0,temp=0;
        while (temp < num){
            temp = (int)(Math.pow(2,power));
            power++;
            if(temp == num){
                a = true;
            }
        }
        if(a){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
