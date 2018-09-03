import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String cpr;
    private int age;
    private String mail;
    private int studentId;
    private String address;
    private ArrayList<String> courses;

    public Student() {
        courses = new ArrayList<>();
    }

    public Student(String firstName, String lastName, String cpr, int age, String mail, int studentId, String address, ArrayList<String> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
        this.age = age;
        this.mail = mail;
        this.studentId = studentId;
        this.address = address;
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpr='" + cpr + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", studentId=" + studentId +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                studentId == student.studentId &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(cpr, student.cpr) &&
                Objects.equals(mail, student.mail) &&
                Objects.equals(address, student.address) &&
                Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, cpr, age, mail, studentId, address, courses);
    }
}
