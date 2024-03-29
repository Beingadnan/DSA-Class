import java.util.Arrays;


public class Revison {

    public static void Recursion(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        Recursion(n-1);
        System.out.println(n);

    }

    public static void Incresing1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n); 
        Incresing1(n-1);
    }

   public static int Factorial(int n){
    if(n<0){
        return 0;
    }
    if(n==0){
        return 1;
    }
   return Factorial(n-1)*n;
   }

   public static int Fibonacci(int n){
    if(n==0 || n==1){
        return n;
    }
    int a=Fibonacci(n-1);
    int b=Fibonacci(n-2);
    return a+b;
   }

   
        public static void main(String[] args) {

            // Recursion(10);
            // Incresing1(5);
            System.out.println(Factorial(5));
            System.out.println(Fibonacci(10));

        }
    
       
    }
    