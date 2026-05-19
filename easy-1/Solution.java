import java.util.*;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        for (int grade : grades) {

            // Nếu nhỏ hơn 38 thì giữ nguyên
            if (grade < 38) {
                result.add(grade);
                continue;
            }

            int remainder = grade % 5;
            int diff = 5 - remainder;

            // Nếu khoảng cách < 3 thì làm tròn
            if (diff < 3 && remainder != 0) {
                grade += diff;
            }

            result.add(grade);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        List<Integer> result = gradingStudents(grades);

        for (int grade : result) {
            System.out.println(grade);
        }

        sc.close();
    }
}