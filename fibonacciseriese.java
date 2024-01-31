import java.util.Scanner;

public class fibonacciseriese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to Fibonacci Serease\n");
        System.out.println("Enter your number");
        int num=sc.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num) {
        int first=0;
        int second=1;
        while (first+second<=num){
            int third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;
        }

    }
}
