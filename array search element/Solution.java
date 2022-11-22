import java.util.*;

class arraysearch
{
    public static void main(String[]args)
    {
        int a[] = new int[6];
        int c,flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array element");
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("array elemnts");

        for(int i = 0; i < 6; i++) {
            System.out.println(a[i] + " ");

        }
        System.out.println("enter search element");
        c = sc.nextInt();
        for(int i = 0; i < 6; i++) {
            if (a[i] == c) {
                flag=1;
            }
        }
        if (flag==1) {
            System.out.println("elemnt found");
        } else {
            System.out.println("elemnet not found");
        }

    }
}
