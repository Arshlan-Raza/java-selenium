class Stud {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String n) {
        name = n;
    }

    public void setRollNo(int a) {
        rollNo = a;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Stud student = new Stud();

        student.setName("Arshlan Raza");
        student.setRollNo(007);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
    }
}
