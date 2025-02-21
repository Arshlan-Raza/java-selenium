import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList<String> student = new ArrayList<>();
//        student.add("Arshlan");
//
//        student.forEach(i -> System.out.println(i));

        List<Integer> list = new ArrayList() ;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("For Loop:");
        for(int i = 0 ; i < list.size() ; i ++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        System.out.print("For Each loop:");
        list.forEach(i -> System.out.print(i+" "));
    }
}
