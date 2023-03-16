import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee implements Person{
    private int id;
    private String name;
    private double salary;
    List<Person> personList=new ArrayList<Person>();
    public Employee(int id, String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("__________________________");
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("__________________________");
        Iterator<Person> it = personList.iterator();

        while(it.hasNext())  {
            Person person = it.next();
            person.print();
        }
    }

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void remove(Person person) {
        personList.remove(person);
    }
}
