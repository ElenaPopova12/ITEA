public class Student {

    int id;
    private String firstName;
    private String lastName;
    int course;
    double mathScore;
    double economicScore;
    double languageScore;

    public Student(int id, String firstName, String lastName, int course, int mathScore,
                   int ecomicScore, int languageScore) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.mathScore = mathScore;
        this.economicScore = ecomicScore;
        this.languageScore = languageScore;
    }
    static class StudentTest {
        public static void main(String[] args) {
            Student st1 = new Student(1, "Olena", "Popova",
                    2, 5, 5, 4);
            System.out.println("Average student grade: Popova " + (st1.mathScore + st1.economicScore + st1.languageScore) / 3);
            Student st2 = new Student(2, "Olena", "Filimonova",
                    2, 4, 4, 5);
            System.out.println("Average student grade: Filimonova " + (st2.mathScore + st2.economicScore + st2.languageScore) / 3);
            Student st3 = new Student(3, "Liza", "Popova",
                    2, 5, 5, 5);
            System.out.println("Average student grade: Popova " + (st3.mathScore + st3.economicScore + st3.languageScore) / 3);
        }
    }
}


