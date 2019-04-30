package visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Employees mEmployees = new Employees();

        mEmployees.add(new Employee("Tom", 4500, 8));
        mEmployees.add(new Employee("Jerry", 6500, 10));
        mEmployees.add(new Employee("Jack", 9600, 12));

        mEmployees.accept(new CalVisit());
        mEmployees.accept(new Cal2());
    }
}
