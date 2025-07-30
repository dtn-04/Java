package Day10.Super;

public class Employee extends Person {
    int salary;

    public Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;

    }

    void showSalary(){
        System.out.println(this.first + "'s slary is: " + this.salary);
    }

    
}
