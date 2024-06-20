
package employees;

/**
 * Represents a developer, extending the Employee class and adding programming language.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
