package visitor;

import java.util.HashMap;

public class Employees extends Element{
    private HashMap<String, Employee> hashMap;

    public Employees() {
        this.hashMap = new HashMap<>();
    }

    public void add(Employee employee) {
        hashMap.put(employee.getName(), employee);
    }

    @Override
    public void accept(Visit visit) {
        for (Employee e : hashMap.values()) {
            e.accept(visit);
        }
    }
}
