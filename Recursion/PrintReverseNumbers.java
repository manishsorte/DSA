package Recursion;

public class PrintReverseNumbers {
    public static void main(String[] args) {
        PrintReverse(10, 10);
    }

    static void PrintReverse(int i, int n) {

        if (i < 0) {
            return;
        }
        System.out.println(i);
        PrintReverse(i - 1, n);

    }
}



