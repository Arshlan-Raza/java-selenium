class  Human{
    private int age ;
    private String name ;

    public Human(){
        System.out.println("Inside Constructor");
    }

    public Human(int age , String name){
        this.age  = age  ;
        this.name = name ;
        System.out.println(age+" "+name);
    }
}

public class Constructor {

    public static void main(String[] args) {
        Human obj = new Human(21,"Arshlan");


    }



}
