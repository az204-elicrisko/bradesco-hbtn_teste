import java.sql.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, 
        boolean pensioner, boolean publicServer) {
            this.name = name;
            this.surname = surname;
            this.birthDate = birthDate;
        }

    public String fullName(){
        return name + " " + surname;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public float calculateYearlySalary(){
        return salary * 12;
    }

    public boolean isMEI(){
        
        return ((salary * 12) < 130000) 
            && (birthDate.compareTo(new java.util.Date()) > 18)
            && (anotherCompanyOwner == false)
            && (pensioner == false)
            && (publicServer == false);

    }

}
