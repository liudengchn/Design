package visitor;

public class Employee extends Element{
    private String name;
    private int age;
    private int workTime;

    public Employee(String name, int age, int workTime) {
        this.name = name;
        this.age = age;
        this.workTime = workTime;
    }

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
