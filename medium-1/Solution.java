import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void extraLongFactorials(int n) {

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {

            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        extraLongFactorials(n);

        sc.close();
    }
}