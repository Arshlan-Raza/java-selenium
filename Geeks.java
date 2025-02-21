class Programmer {
    String name ; 

    String getName () {
        return name ;
    }

    void setName (String name){
        this.name = name ; 
    }
}

public class Geeks {
    public static void main(String[] args) {
        Programmer p = new Programmer() ; 
        p.setName("this is just a example");
        // System.out.print(p.setName("this is a example"));
        System.out.println(p.getName());
    }
}
