public class Student {
    private static String name;
    private static int course;
    private static int grade;


    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void showinfo() {
        System.out.println("Student name:" + " " + name + " " + "Student course:" + " " +
                course + " " + "Student grade:" + " " + grade);
    }

    public static class TestStudent {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Olena");
            student.setCourse(3);
            student.setGrade(5);
            showinfo();
        }
    }
}