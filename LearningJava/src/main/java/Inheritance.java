class Animal {
    String voice ;
    String name ;
    int legs ;

    public  Animal(String voice , String name ,int legs){
        this.voice = voice ;
        this.name = name ;
        this.legs = legs ;
    }

    public void describe(){
        System.out.println("Name of the animal:"+this.name+"\nVoice of Animal:"+this.voice+"\nLegs of Animal:"+this.legs);
    }
}

// using the super and this keyword
class Dog extends Animal{
    String food ;

    public Dog(String voice, String name, int legs,String food) {
        super(voice, name, legs);
        this.food = food ;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Animal eats:"+this.food);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog dg = new Dog("vow vow","lexi",4,"pedigree");
        dg.describe();


    }
}
