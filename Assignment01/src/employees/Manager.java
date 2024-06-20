
package employees;

/**
 * Represents a manager, extending the Employee class and adding department.
 */
public class Manager extends Employee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
