package Day10.Super;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Harry", "Poter", 3.25);
        Employee employee = new Employee("Harry", "Poter", 10000);

        student.showGPA();
        employee.showSalary();
    }
}
