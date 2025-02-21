
    abstract class Arshlan {
        abstract void turnOn();
        abstract void turnOff();
    }
    
    class TVRemote extends Arshlan {
        @Override
        void turnOn() {
            System.out.println("TV is turned ON.");
        }
    
        @Override
        void turnOff() {
            System.out.println("TV is turned OFF.");
        }
    }
    
    public class Abstraction {
        public static void main(String[] args) {
            Arshlan remote = new TVRemote();
            remote.turnOn();   
            remote.turnOff();  
        }
    }
    
