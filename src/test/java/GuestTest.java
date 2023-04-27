import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class GuestTest {


    @Test
    void shouldBeEmptyInitially(){
        //given
        GuestList guestList = new GuestList();  // new instance
        ArrayList<Guest> emptyList = new ArrayList<>(); //
        guestList.setGuests(emptyList); // give emptyList
        //when
        ArrayList<Guest> actualList = guestList.getGuests();
        //then
        assertTrue(actualList.isEmpty()); // check if list is empty
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore(){
        //given
        GuestList guestList = new GuestList();
        ArrayList<Guest> guest1 = new ArrayList<>();
        Guest karl = new Guest("Karl");
        Guest ute = new Guest("Ute");
        guest1.add(karl);
        guest1.add(ute);
        guestList.setGuests(guest1);
        //when
        ArrayList<Guest> actualGuests = guestList.getGuests();
        //then
        assertTrue(actualGuests.contains(karl) && actualGuests.contains(ute));
    }

}

