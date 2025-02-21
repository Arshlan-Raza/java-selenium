class Add{
    int  a ; 
    int b ; 
    int  add(int a , int b){
        return a+b ; 
    }
}

public class Summing {
    public static void main(String  args[]){
            Add a  = new Add();
            int ans = a.add(1, 4);

            System.out.println(ans);
    }
}
