import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("your stop");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("your stop", busStop.getName());
    }

    @Test
    public void isEmpty(){
        assertEquals(0, busStop.totalInQueue());
    }

    @Test
    public void canAddPerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.totalInQueue());
    }

    @Test
    public void canRemovePerson(){
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.totalInQueue());
    }

}
