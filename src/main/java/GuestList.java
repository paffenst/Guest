import java.util.ArrayList;
import java.util.Arrays;

public class GuestList {
    private ArrayList<Guest> guests;
    public GuestList(){
    }

    public GuestList(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

}
