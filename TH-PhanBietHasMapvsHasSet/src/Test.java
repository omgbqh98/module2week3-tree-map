import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(1, "huynh");

        Map<Integer, Student> hasMap = new HashMap<>();
        hasMap.put(1, student);
        hasMap.put(2, new Student(2, "quang"));
        hasMap.put(3, new Student(3, "khai"));
        hasMap.put(4, new Student(4, "quy"));
        for (Map.Entry<Integer,Student> studentEntry:hasMap.entrySet()) {
            System.out.println(hasMap.toString());
        }

        System.out.println("===hasSet===");
        Set<Student> hasSet = new HashSet<Student>();
        hasSet.add(student);
        hasSet.add(new Student(2,"dsds"));
        hasSet.add(new Student(3,"oanh"));
        hasSet.add(new Student(5, "puong"));
        hasSet.add(new Student(9, "puong1"));

        for (Student student1 : hasSet) {
            System.out.println(student1);
        }
    }
}
