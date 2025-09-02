import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setup() {
        person = new Person("Paul","McCartney","02/09/2000",true,true,true);
    }

    @Test
    public void show_full_name() {
        Assertions.assertEquals("Paul McCartney", person.fullName());
    }

    @Test 
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        Assertions.assertNotEquals(14400, person.getSalary(), 0.1f);
    }

    @Test
    public void person_is_MEI(){
        Person personMei = new Person("Este", "Mei", "02/09/2000", false, false, false);
        personMei.setSalary(1000);
        Assertions.assertTrue(personMei.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person.setSalary(1200);
        Assertions.assertFalse(person.isMEI());
    }
}
