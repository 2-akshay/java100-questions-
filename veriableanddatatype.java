import java.util.Scanner;

public class veriableanddatatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
//        these 3 numbers.
//        (Hint : Average of N numbers is sum of those numbers divided by N)

        int a=20;
        int b=30;
        int c=40;

        int avg=(a+b+c)/3;
        System.out.println(avg);

//        Question 2: In a program, input the side of a square. You have to output the area of the
//        square.
//        (Hint : area of a square is (side x side))

        System.out.print("Please Enter side1=");
        float side1=sc.nextFloat();
        System.out.print("please Enter Side2=");
        float side2=sc.nextFloat();

        float area=side1*side2;
        System.out.println("area of square="+area);

//        Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//        an eraser. You have to output the total cost of the items back to the user as their bill.
//        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

        System.out.print("Enter the cost of pencil=");
        float pencil=sc.nextFloat();
        System.out.print("Enter cost of pen=");
        float pen=sc.nextFloat();
        System.out.println("Enter the cot of reaser=");
        float eraser=sc.nextFloat();

        float total=pencil+pen+eraser;
        System.out.println(total);

        float gst=(total)%18;
        System.out.println("the gst of this product is ="+gst);




    }

}
