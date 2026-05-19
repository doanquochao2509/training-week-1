import java.util.*;

public class Solution {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;

        // Tìm max của a
        int start = Collections.max(a);

        // Tìm min của b
        int end = Collections.min(b);

        // Duyệt từ max(a) -> min(b)
        for (int x = start; x <= end; x++) {

            boolean isValid = true;

            // Kiểm tra:
            // x có chia hết cho mọi phần tử trong a không
            for (int numA : a) {

                if (x % numA != 0) {
                    isValid = false;
                    break;
                }
            }

            // Nếu fail thì bỏ qua luôn
            if (!isValid) {
                continue;
            }

            // Kiểm tra:
            // mọi phần tử trong b có chia hết cho x không
            for (int numB : b) {

                if (numB % x != 0) {
                    isValid = false;
                    break;
                }
            }

            // Nếu pass cả 2 điều kiện
            if (isValid) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        // Nhập mảng a
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        // Nhập mảng b
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        int result = getTotalX(a, b);

        System.out.println(result);

        sc.close();
    }
}