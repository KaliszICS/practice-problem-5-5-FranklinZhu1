public class Student implements Comparable<Student> {

    private String name, studentNumber;
    private int age;

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    @Override
    public String toString() {
        return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.parseInt(this.studentNumber) - Integer.parseInt(student.getStudentNumber());
    }

}