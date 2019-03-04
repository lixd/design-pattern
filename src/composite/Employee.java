package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 *
 * @author illusoryCloud
 */
public class Employee {
    private String name;
    /**
     * 职位
     */
    private String dept;
    /**
     * 工资
     */
    private int salary;
    /**
     * 下属 一个Employee集合
     */
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
