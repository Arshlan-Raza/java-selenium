import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Arshlan",1));
        students.add(new Student("Imran",2));
        students.add(new Student("Kunal",3));
        students.add(new Student("Shravan",4));
        students.add(new Student("Umang",5));
        students.add(new Student("Arshlan",1));

        System.out.println(students);

//        set.add(23);
//        set.add(12);
//        set.add(15);
//        set.add(29);
//
//        System.out.println(set);
//
//        set.remove(12);
//
//        System.out.println(set);
    }
}
