import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("huynh", 19, "hanoi");
        Student student1 = new Student("hoang", 20, "hanoi");
        Student student2 = new Student("hoang1", 21, "hanoi");
        Student student3 = new Student("hoang2", 22, "hanoi");

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        Collections.sort(listStudent);
        for (Student st : listStudent) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(listStudent, ageComparator);
        System.out.println("so sanh theo tuoi: ");
        for (Student st : listStudent) {
            System.out.println(st.toString());
        }
    }
}
