package _inheritance;

public class Student extends Person {
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void logDifferent() {
        System.out.println("Logged from Student.class");
    }
}
