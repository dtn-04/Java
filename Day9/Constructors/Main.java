
public class Main {
    public static void main(String[] args) {
        student student1 = new student("ngan", 21, 3.08);
        student student2 = new student("nganz", 31, 3.08);

        System.out.println(student1.name);
        System.out.println(student2.age);

        student1.study();
        student2.study();
    }
}
