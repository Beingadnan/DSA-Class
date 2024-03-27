public class Recursion {
    public static void Incresing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        Incresing(n-1);
        System.out.println(n);

    }
    












    public static void Decreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Decreasing(n-1);
    }

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int small=Factorial(n-1);
        int big=n*small;
        return big;
        
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
        int n=5;
        Incresing(n);
        Decreasing(n);
        System.out.println(Factorial(n));
        System.out.println(Fibonacci(2));
    }
}
