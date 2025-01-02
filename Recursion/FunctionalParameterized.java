package Recursion;

public class FunctionalParameterized {

    static int functional(int n){
        if(n == 0){
            return 0;
        }
       return n + functional(n-1);
    }

    static void parameterized(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        parameterized(n-1, sum+n);
    }

    public static void main(String[] args) {
        System.out.println(functional(3));
        parameterized(3,0);
    }
}
