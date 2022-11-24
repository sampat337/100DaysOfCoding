import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        int a, flag = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of the driver");
        a = sc.nextInt();

        if (a <= 70) {
            System.out.println("ok");
        }
        else
        {

            if (a >= 70) {
                b = a - 70;

                b = b / 5;
                System.out.println("Points:" + b);
            }
                if (b >= 12) {
                    System.out.println("License suspended!!! ");
                }

        }

        }
}
