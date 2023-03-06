public class Accountant implements Person{
    private int id;
    private String name;
    private double salary;
    public Accountant(int id,String name,double salary)  {
        this.id=id;
        this.name = name;
        this.salary = salary;
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
        System.out.println( "Id =" +getId());
        System.out.println( "Назва =" +getName());
        System.out.println( "Зарплата =" +getSalary());
        System.out.println("__________________________");
    }

    @Override
    public void add(Person person) {

    }

    @Override
    public void remove(Person person) {

    }

}
