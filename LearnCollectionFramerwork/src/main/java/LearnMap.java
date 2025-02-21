import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> number = new HashMap<>();

        number.put("One",1);
        number.put("Two",2);
        number.put("Three",3);
        number.put("Four",4);
        number.put("Five",5);

        System.out.println(number);

        for(String key : number.keySet()){
            System.out.print(key+" ");
        }

        for(Integer value : number.values()){
            System.out.print(value+" ");
        }
    }
}
