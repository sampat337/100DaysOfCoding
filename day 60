import java.util.*;
import java.util.stream.IntStream;

public class task30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
        int[] arr = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        sc.close();
        long result = IntStream.range(0, n)
            .flatMap(from -> IntStream.rangeClosed(from + 1, n)
                     .map(to -> Arrays.stream(arr, from, to)
                         .sum()))
            .filter(sum -> sum < 0)
            .count();
        System.out.println(result);
    }
}
