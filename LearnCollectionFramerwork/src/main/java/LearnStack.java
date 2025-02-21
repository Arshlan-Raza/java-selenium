import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Lion") ;
        stack.push("Cat") ;
        stack.push("Deer") ;
        stack.push("Elephant") ;
        stack.push("Tiger") ;

        System.out.println(stack);

        for ( String element : stack){
            System.out.println(element+" ");
        }

        System.out.println("Peek element is:"+stack.peek());

        stack.pop() ;

        for ( String element : stack){
            System.out.println(element+" ");
        }

    }

}
