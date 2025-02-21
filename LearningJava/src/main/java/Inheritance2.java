class Cal {
    int a , b ;

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
}

class AdvnCal extends Cal{
    public int multi(int a , int b){
        return a * b ;
    }
    public double div(int a , int b){
        return (double) a / b ;
    }
}

//MultiLevel Inheritance
class VryAdvCal extends AdvnCal{
    public double power(int n1 , int n2 ){
        return Math.pow(n1,n2);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        VryAdvCal obj = new VryAdvCal();

        int r1 = obj.add(2,3);
        int r2 = obj.sub(4,2);
        int r3 = obj.multi(4,5);
        double r4 = obj.div(10,3);
        double r5 = obj.power(3,2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);


    }
}
