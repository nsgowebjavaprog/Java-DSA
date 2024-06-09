package Maths;
// eg : 1234 o/p=4
// eg 2: 4543453 o/p=7
// count no.of digits

class Count_Number {
        public static void main(String[] args) {
            int num = 3423;
            int count = 0;
            while(num>0){
                num = num/10;
                count +=1;
            }
         
        }
    
}