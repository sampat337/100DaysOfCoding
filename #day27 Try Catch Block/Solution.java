import java.util.*;
import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
          int [] a = new int [3];
          a[0] = 23;
          a[1] = 34;
          a[2] = 43;
          System.out.println("enter the array index");
          Scanner sc = new Scanner(System.in);
          int i = sc.nextInt();
          try 
          {
                
              System.out.println(a[i]);
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
    }
}
