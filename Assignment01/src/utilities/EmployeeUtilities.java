

package utilities;

import employees.Employee;

/**
 * Utility class for Employee-related operations.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of the given employee.
     *
     * @param employee the employee whose details are to be printed
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
