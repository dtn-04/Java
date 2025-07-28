
public class student {
    String name;
    int age;
    double gpa;
    boolean status;

    public student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.status = true;
    }

    void study(){
        System.out.println(this.name + " is studying.");
    }
    
    
}
