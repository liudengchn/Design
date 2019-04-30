package visitor;

public class Cal2 implements Visit {
    @Override
    public void visit(Element element) {
        Employee employee = ((Employee) element);
        System.out.println(employee.getName() + "'s Compensation is "
                + (employee.getAge()));
    }
}
