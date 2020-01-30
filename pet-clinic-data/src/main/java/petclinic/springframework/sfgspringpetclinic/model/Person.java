package petclinic.springframework.sfgspringpetclinic.model;

public class Person extends BaseEntity{
    private String fristName;
    private String lastName;

    public Person(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
