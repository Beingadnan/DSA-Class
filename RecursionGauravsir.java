public class RecursionGauravsir {

    public static void Incresing(int n){
        if(n==0){
            return;
        }
        Incresing(n-1);
        System.out.println(n); 
    }

    public static void Incresing1(int n){
        if(n==6){
            return;
        }
        System.out.println(n); 
        Incresing1(n+1);
    }

    public static void Decreasing(int n){
        if(n==0){
            // System.out.println(1);
            return;
        }
        System.out.println(n);
        Decreasing(n-1);
         
    }
    public static void check(int start,int end){
        if(start>end){
            return;
        }
        System.out.println(start);
        check(start+1, end);
    }

    public static void Sum(int start,int end,int sum){
        if(start==end){
            System.out.println(sum+end);
            return;
        }
        sum=sum+start;
        Sum(start+1, end, sum);
        System.out.println(start);
    }

    public static int SUM(int start){
        if(start==5){
            return 5;
        }
        return start+SUM(start+1);
    }

    public static int Factorial(int n){
        if(n<0){
            System.out.println("Factorial is not defined");
            return 0;
        }
        if(n==0){
            return 1;
        }
       return Factorial(n-1)*n;
    }

    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n ;
        }
        int a=Fibonacci(n-1);
        int b=Fibonacci(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        Incresing(10);
        // Incresing1(1);
        // Decreasing(10);
        // check(1, 10);
        // System.out.println(Fibonacci(3));
        // Sum(1, 10, 0);
        // System.out.println(SUM(1));
        // System.out.println(Factorial(3));
        // System.out.println(Fibonacci(10));

        // for(int i=0;i<10;i++){
        //     System.out.print(Fibonacci(i)+" ");
        // }
    }
}
