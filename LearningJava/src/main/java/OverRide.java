class Ar{
    public void show(){
        System.out.println("In A Show");
    }

    public void confiq(){
        System.out.println("In A Confiq");
    }
}

class Br extends Ar{

    
    public void show(){
        System.out.println("In B Show");
    }

    public void confiq(){
        System.out.println("In B Confiq");
    }
}


public class OverRide {
    public static void main(String[] args) {
        Br obj = new Br();
        obj.show();
    }
}
