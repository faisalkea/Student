import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setFirstName("Faisal");
        student.setLastName("Jarkass");
        student.setAge(33);
        student.setAddress("The Address 13 3 th");
        student.setCpr("12121212");
        student.setMail("fafj@kea.dk");
        student.setStudentId(1234);

        //SWC 1, 2 & 3
        ArrayList<String> courses = new ArrayList<>();
        courses.add("SWC1");
        courses.add("SWC2");
        courses.add("SWC3");
        student.setCourses(courses);

        Student student2 = new Student("Faisal",
                "Jarkass","12121212",
                33,"fafj@kea2.dk",
                123, "The Address", courses);

        students.add(student);
        students.add(student2);

       /* System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(students.toString());*/

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }

}
