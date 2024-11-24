import java.util.*;

public class EMS {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---------------EMPLOYEE MANAGEMENT SYSTEM--------------------");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. List All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Corrected to use scanner
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String dept = scanner.nextLine();
                    Employee emp = new Employee(id, empName, dept); // Corrected to use empName
                    employeeService.addEmployee(emp);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    employeeService.removeEmployee(removeId);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee empFound = employeeService.searchEmployee(searchId);
                    if (empFound != null) { // Corrected to use empFound
                        System.out.println("Employee Found: " + empFound);
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 4:
                    List<Employee> employees = employeeService.listAllEmployees();
                    if (employees.isEmpty()) { // Corrected to use employees
                        System.out.println("No employees found");
                    } else {
                        System.out.println("All Employees");
                        for (Employee e : employees) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5); // Corrected loop structure
    } // main method
} // class EMS