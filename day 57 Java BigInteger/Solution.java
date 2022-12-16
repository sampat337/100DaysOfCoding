import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigNumber1 = new BigInteger(sc.nextLine());
        BigInteger bigNumber2 = new BigInteger(sc.nextLine());
        
        //+
        System.out.println(bigNumber1.add(bigNumber2));
        //x
        System.out.println(bigNumber1.multiply(bigNumber2));
    }
}
