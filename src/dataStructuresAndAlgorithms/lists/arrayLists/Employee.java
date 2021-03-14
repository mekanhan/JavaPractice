package dataStructuresAndAlgorithms.lists.arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("Jacob","Josenny", 145));
        employeeList.add(new Employee("Jordan","Jorenny", 1146));
        employeeList.add(new Employee("Elizabeth","Keen", 0047));
//        System.out.println(employeeList);

//        employeeList.forEach(employee -> System.out.println(employee));      // print employee list using forEach
        System.out.println(employeeList.get(1)); //print index 1
        System.out.println(employeeList.isEmpty());  // is list empty?
        employeeList.set(1, new Employee("John", "Adams", 4568));   //adding/replacing new employee

//        employeeList.forEach(employee -> System.out.println(employee));     // print employee list using forEach
        System.out.println(employeeList.size());    //how many employees in the list
        employeeList.add(3, new Employee("John", "Doe", 4567));    //adding/replacing new employee

//        employeeList.forEach(employee -> System.out.println(employee));     // print employee list using forEach
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for ( Employee employee: employeeArray){
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("John","Adams",4568)));   // to check employee name

    }

}
