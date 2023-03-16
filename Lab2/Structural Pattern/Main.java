public class Main {
    public static void main(String[] args) {
        //Composite Pattern
        Person person1=new Accountant(145,"Alica Jonathan", 15000.0);
        Person person2=new Director(160,"Will Brookes",25000.0);
        Person person3=new Salesman(161,"Jane Weller",9000.0);
        Person person4=new Salesman(163,"Sam Harris",1000.0);
        Person employees=new Employee(123,"John Brawn", 35000.0);;
        employees.add(person1);
        employees.add(person4);
        employees.add(person3);
        employees.add(person2);
        employees.print();
    }
}