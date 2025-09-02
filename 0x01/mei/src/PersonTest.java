import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @BeforeEach
    public setup() {
        Person person = new Person("Paul","McCartney",2000,true,true,true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test 
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.getSalary());
    }

    @Test
    public void person_is_MEI(){
        Person personMei = new Person("Este", "Mei", "02/09/2000", false, false, false);
        assertTrue(personMei.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }
}
