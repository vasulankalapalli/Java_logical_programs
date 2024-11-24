//Interfaces
import java.util.List;
interface EmployeeService 
{
    void addEmployee(Employee emp);
    void removeEmployee(int empId);
    Employee searchEmployee(int empId);
    List<Employee> listAllEmployees();
}