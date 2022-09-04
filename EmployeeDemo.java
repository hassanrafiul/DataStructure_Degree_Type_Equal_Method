package proj1;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee(DegreeType.Doctorate, "Dr ", "J", 10);
        Employee emp3 = new Employee(DegreeType.Associate, "Rafiul ", "Hassan", 1);
        Employee emp4 = new Employee(DegreeType.Doctorate, "Dr J", "Same Level", 10);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());

        System.out.println(emp2.compareTo(emp1));
        System.out.println(emp2.equals(emp1));

        System.out.println(emp3.compareTo(emp2));
        System.out.println(emp3.equals(emp2));

        System.out.println(emp2.compareTo(emp4));
        System.out.println(emp2.equals(emp4));

    }

}
