class Student {
    int roll ;
    String name ;
    int marks ;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Arshlan";
        s1.roll = 7 ;
        s1.marks = 88 ;

        s2.name = "Kunal";
        s2.roll = 28 ;
        s2.marks = 89 ;

        s3.name = "Imran";
        s3.roll = 33 ;
        s3.marks = 90 ;

        Student[] students = {s1,s2,s3};

        for(Student s : students ){
            System.out.println(s.name+" "+s.marks);
        }
    }
}


