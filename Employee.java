package proj1;

public class Employee implements Comparable<Employee> {

    private DegreeType degree;
    private String firstName;
    private String lastName;
    private int experience;
    private int valuePoints;

    public Employee() {
        degree = DegreeType.None;
        firstName = "Stan";
        lastName = "Dupp";
        experience = 0;
        valuePoints = experience * (degree.ordinal() + 1);
    }

    public Employee(DegreeType degree, String firstName, String lastName, int experience) {
        this.degree = degree;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.valuePoints = experience * (degree.ordinal() + 1);

    }

    public void setDegree(DegreeType degree) {
        this.degree = degree;
    }

    public DegreeType getDegree() {
        return degree;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public int getValuePoints() {
        return valuePoints;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " has been with the company for " + experience + " years and has a degree level of " + degree;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if (this.valuePoints < otherEmployee.valuePoints) {
            return -1;
        } else if (this.valuePoints == otherEmployee.valuePoints) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return this.valuePoints == other.valuePoints;
    }

}
