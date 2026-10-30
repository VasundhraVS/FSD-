package Day10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Employee {

    int employeeId;
    String employeeName;
    int departmentId;
    double salary;

    Employee(int employeeId, String employeeName,
             int departmentId, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department ID : " + departmentId);
        System.out.println("Salary        : Rs. " + salary);
        System.out.println("--------------------------------");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<Employee> employees = new ArrayList<>();

        // 2. Add 5 employee records
        employees.add(new Employee(101, "Arun", 1, 30000));
        employees.add(new Employee(102, "Priya", 2, 45000));
        employees.add(new Employee(103, "Kumar", 1, 25000));
        employees.add(new Employee(104, "Divya", 3, 60000));
        employees.add(new Employee(105, "Ravi", 2, 50000));

        // 3. Create HashMap for departments
        HashMap<Integer, String> departments = new HashMap<>();

        departments.put(1, "IT");
        departments.put(2, "HR");
        departments.put(3, "Finance");

        // 4. Display all employees using Iterator
        System.out.println("===== ALL EMPLOYEE DETAILS =====");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            e.display();
        }

        // 5. Search employee using Employee ID
        int searchId = 103;
        boolean found = false;

        System.out.println("\n===== SEARCH EMPLOYEE =====");

        for (Employee e : employees) {

            if (e.employeeId == searchId) {
                System.out.println("Employee Found!");
                e.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        // 6. Remove employee using Employee ID
        int removeId = 105;
        boolean removed = false;

        System.out.println("\n===== REMOVE EMPLOYEE =====");

        Iterator<Employee> removeItr = employees.iterator();

        while (removeItr.hasNext()) {

            Employee e = removeItr.next();

            if (e.employeeId == removeId) {

                System.out.println("Deleted Employee:");
                e.display();

                removeItr.remove();
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Employee not found.");
        }

        // 7. Display Department details using HashMap
        System.out.println("\n===== DEPARTMENT DETAILS =====");

        System.out.println("Department 1: " + departments.get(1));
        System.out.println("Department 2: " + departments.get(2));
        System.out.println("Department 3: " + departments.get(3));

        // 8. Display employees department-wise
        System.out.println("\n===== DEPARTMENT-WISE EMPLOYEES =====");

        for (Integer deptId : departments.keySet()) {

            System.out.println("\nDepartment: " + departments.get(deptId));

            for (Employee e : employees) {

                if (e.departmentId == deptId) {
                    System.out.println(
                        e.employeeId + " - " +
                        e.employeeName + " - Rs. " + e.salary
                    );
                }
            }
        }

        // 9. Sort employees based on salary
        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("\n===== EMPLOYEES SORTED BY SALARY =====");

        for (Employee e : employees) {
            e.display();
        }

        // 10. Display highest-paid employee
        System.out.println("\n===== HIGHEST PAID EMPLOYEE =====");

        if (!employees.isEmpty()) {

            Employee highest = employees.get(employees.size() - 1);

            System.out.println("Highest Salary Employee:");
            highest.display();
        }
    }
}
