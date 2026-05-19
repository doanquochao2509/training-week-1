import java.util.*;

public class Solution {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // Nếu kangaroo đứng sau nhưng nhảy chậm hơn hoặc bằng
        // thì không bao giờ đuổi kịp
        if (x1 < x2 && v1 <= v2) {
            return "NO";
        }

        // Kiểm tra có gặp nhau đúng tại 1 vị trí hay không
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.println(kangaroo(x1, v1, x2, v2));

        sc.close();
    }
}