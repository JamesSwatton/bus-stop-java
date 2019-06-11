import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 2);
        person = new Person();
        busStop = new BusStop("somewhere");
        busStop.addPerson(person);
    }

    @Test
    public void canGetDestination(){
        assertEquals("Glasgow", bus. getDestination());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void canAddPerson(){
        bus.addPerson(person);
        assertEquals(1, bus.totalPassengers());
    }

    @Test
    public void willRejectIfAtCapacity(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(2, bus.totalPassengers());
    }

    @Test
    public void willLetPersonOff(){
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(0, bus.totalPassengers());
    }

    @Test
    public void canPickUpPerson(){
        bus.pickUpPerson(busStop);
        assertEquals(1, bus.totalPassengers());
    }

}
