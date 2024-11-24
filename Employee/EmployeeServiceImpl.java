//Implementation
import java.util.*;

class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>(); // Corrected variable name

    @Override
    public void addEmployee(Employee emp) {
        employees.add(emp); // Use the correct variable name
        System.out.println("Employee added successfully");
    }

    @Override
    public void removeEmployee(int empId) {
        Employee toRemove = null; // Declare the variable
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Employee removed successfully");
        } else {
            System.out.println("Employee not found");
        }
    }

    @Override
    public Employee searchEmployee(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                return emp;
            }
        }
        return null; // Return null if employee not found
    }

    @Override
    public List<Employee> listAllEmployees() {
        return employees; // Return the list of employees
    }
}