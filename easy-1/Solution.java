import java.util.*;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {

            int grade = grades.get(i);

            if (grade >= 38) {

                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3) {
                    grades.set(i, nextMultiple);
                }
            }
        }

        return grades;
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