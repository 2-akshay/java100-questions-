import java.util.Scanner;

public class loopsPattrens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to loops patterns");
        System.out.println("Enter your number");
        int num=sc.nextInt();
        rightHalfPyramid(num);
        reversRightHalfPyramid(num);
    }
    public static void rightHalfPyramid(int num){
        System.out.println("Welcome to right half pyramid\n");
        int i=0;

        while (i<num){
            System.out.print("*");
            int j=0;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void reversRightHalfPyramid(int num){
        System.out.println("welcome to revers right half pyramid\n");
        int i=num;
        while (i>0) {
           System.out.print("*");
            int j = 0;
            while (j < i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i--;

        }
    }

}
