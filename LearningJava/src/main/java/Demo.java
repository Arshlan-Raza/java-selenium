class Mobile{
    String brand ;
    int price ;
    String name ;

    public void show() {
        System.out.println(brand+" "+price+" " +name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1400;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Google";
        obj2.price = 1200;
        obj2.name = "SmartPhone";

        Mobile obj3 = new Mobile();
        obj3.brand = "Samsung";
        obj3.price = 799;
        obj3.name = "SmartPhone";

        obj1.show() ;
        obj2.show() ;
        obj3.show() ;

        

    }
}
