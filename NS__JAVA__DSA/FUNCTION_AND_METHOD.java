
// 1
//public class FUNCTION_AND_METHOD {
//    public static void print_world(){
//        System.out.print("Alway ");
//        System.out.print("Coder ");
//        System.out.print(" Like ");
//        System.out.print("Logic");
//
//        return;
//    }
//
//    public static void main(String[] args) {
//        print_world();
//    }
//}



// 2.PARAMETERS

//import java.util.Scanner;
//
//public class FUNCTION_AND_METHOD {
//    public static int cal_sum(int a, int b){  // formal parameter
//        int sum = a+b;
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = cal_sum(a,b);   // function call--->arguments--->acthual
//        System.out.println("Sum : "+sum);
//    }
//}




// 3.SWAP

//import java.util.Scanner;

//public class FUNCTION_AND_METHOD {
//    public static void swap(int a,int b){
//        int temp = a;
//        a=b;
//        b=temp;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        swap(a,b);
//        System.out.println("a="+a+"b="+b);    //a=12b=21 BECAUSE---->Java Always Calls by value
//    }
//}

// 4.PRODUCT

//public class FUNCTION_AND_METHOD {
//    public static int product_res(int a,int b){
//        int product = a*b;
//        return product;
//    }
//
//    public static void main(String[] args) {
//        int a= 10,b=20;
//        int prod = product_res(a,b);
//        System.out.println("Product : "+prod);  //Product : 200
//    }
//}

// 5.FACTORIAL

public class FUNCTION_AND_METHOD {
    public static void fact_num(int n) {
        for(int i=1;i<=n;i++){

            if (i == 0 || i == 1) {
                System.out.println(i);
            } else {
                int fact = n * (n-1);
                System.out.println(fact);;
            }
        }

    }

        public static void main (String[] args){
            fact_num(5);
        }
    }
