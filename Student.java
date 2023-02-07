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
        if (name.length() > 3)
            this.name = name;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4)
            this.course = course;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showinfo() {
        System.out.println("Student name:" + " " + name + " " + "Student course:" + " " +
                course + " " + "Student grade:" + " " + grade);
    }

    public static class TestStudent {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Olena");
            student.setCourse(1);
            student.setGrade(10);
            student.showinfo();
        }
    }
}