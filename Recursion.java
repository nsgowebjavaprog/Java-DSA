/*
public class Recursion {
  public static void print_num(int n){
       if(n==0){
           return;
       }
       System.out.println(n);
       print_num(n-1);
   }
   public static void main(String[] args) {
       int n = 5;
       print_num(n); */

    // 2

   /*
    public static void print_sum(int i,int n,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        print_sum(i+1,n,sum);
    }
    public static void main(String[] args) {
        print_sum(1,10,0);
    }
    */

     // 3
   /* public static int factorial(int n){
        if( n==0 || n==1){
            return 1;
        }
        int fact_nm1 = factorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }*/

    // 4. fib

   /* public static void fib_series(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=  a+b;
        System.out.println(c);
        fib_series(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fib_series(a,b,n-2);
    }
}
*/

// Tower_Of_Hanoi
/*
public class Recursion {
    public static void Tower_Of_Hanoi(int n,String src, String helper,String dest){

        if(n == 1){
            System.out.println("Transfer Disk "+n+" From "+src+" To "+dest);
            return;
        }
        Tower_Of_Hanoi(n-1,src,dest,helper);
        System.out.println("Transfer Disk "+n+" From "+src+" To "+dest);
        Tower_Of_Hanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n =3;
        Tower_Of_Hanoi(n,"S","H","D");
    }
}
// OUTPUT:

Transfer Disk 1 From S To D
Transfer Disk 2 From S To H
Transfer Disk 1 From D To H
Transfer Disk 3 From S To D
Transfer Disk 1 From H To S
Transfer Disk 2 From H To D
Transfer Disk 1 From S To D
 */

// 2.reverse string

/*
public class Recursion {
    public static void string_rev(String str,int idx){   // TC=O(n)
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        string_rev(str,idx-1);
    }

    public static void main(String[] args) {
        String str = "Apple";
        string_rev(str,str.length()-1);
    }
}*/



// Hi It A Recursion With Best Solution

// 1.Print Name 'N' Times using Recursion    || TC=O(n)  SC=O(n) ||

/*
public class Recursion {
    public static void print_name(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("NS Loni Good Morning");
        print_name(i+1,n);
    }

    public static void main(String[] args) {
        int n =3;
        print_name(1,n);
    }
}
// output:

NS Loni Good Morning
NS Loni Good Morning
NS Loni Good Morning
 */


// 2. Print linearly From 1 to N
/*
public class Recursion {
    public static void print_name(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(" "+i);
        print_name(i+1,n);
    }

    public static void main(String[] args) {
        int n =5;
        print_name(1,n);
    }
}
//OUTPUT:   1 2 3 4 5
*/



// 3. Print linearly From N to 1
/*
public class Recursion {
    public static void print_name(int i, int n){
        if(i<n){
            return;
        }
        System.out.print(" "+i);
        print_name(i-1,n);
    }

    public static void main(String[] args) {
        int i = 5;
        int n = 1;
        print_name(i,n);
    }
}
// OUTPUT:  5 4 3 2 1
 */

// 4. Print linearly From 1 to N  WITH_OUT USING {i+1}
/*
public class Recursion {
    public static void print_name(int i, int n){
        if(i<1){
            return;
        }
        print_name(i-1,n);
        System.out.print(" "+i);
    }

    public static void main(String[] args) {
        int n =5;
        print_name(n,n);
    }
}*/
// OUTPUT:  1 2 3 4 5

// 5. Print linearly From n TO 1-->  WITH_OUT USING {i-1}
/*
public class Recursion {
    public static void print_name(int i, int n){
        if(i>n){
            return;
        }
        print_name(i+1,n);
        System.out.print(" "+i);
    }

    public static void main(String[] args) {
        int n =5;
        int i=1;
        print_name(i,n);
    }
}*/
// OUTPUT:  5 4 3 2 1


// 6.Sum n natural numbers
/*
public class Recursion {
    public static int sum_n_num(int n){
        if(n==0){
            return 0;
        }
        return n + sum_n_num(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = sum_n_num(n);
        System.out.println(res);
    }
}
// 15
 */

// 7.Factorial     TC = O(n)
/*
public class Recursion {
    public static int sum_n_num(int n){
        if(n==1){
            return 1;
        }
        return n * sum_n_num(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = sum_n_num(n);
        System.out.println("Factorial of Number: "+res);
    }
}
// output: Factorial of Number: 120
*/

// 8.Fibonacci Series
/*

public class Recursion {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void print_fibo(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+"  ");      //   0  1  1  2  3
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int res = fibo(n);
        System.out.println("Fib of Numbers: "+res);  // Fib of Numbers: 5
        print_fibo(n);
    }
}
*/

//  9. Reverse an Array
/*
public class Recursion {
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void rev_array(int i, int arr[], int n){
        if(i>=n/2){
            return;
        }
        swap(arr ,i,n-i-1);
        rev_array(i+1, arr, n);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rev_array(0,arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");            // 5  4  3  2  1
        }
    }
}
*/

// 10. Palindrome
/*
public class Recursion {
    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String palindrome1 = "madam";
        boolean isPalindrome1 = isPalindrome(palindrome1);
        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome1);
    }
}
 */
//  output: madam is a palindrome: true

// 11.Print all SubSequence
// Eg{1}: [3,1,2] ==> [],[1],[2],[3],[1,2],[1,3],[3,2],[3,1,2]---->[8]
/*
public class Recursion {
    public static void generateSubSequences(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        generateSubSequences(str, current + str.charAt(index), index + 1);
        generateSubSequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        generateSubSequences(str, "", 0);
    }
}
// OUTPUT:

 abc
 ab
 ac
 a
 bc
 b
 c
*/








