import java.util.ArrayList;
public class main {
    public static void main(String[] args) {

        Guest guest = new Guest("Ivonne");
        Guest guest1 = new Guest("Moritz");
        Guest guest2 = new Guest("Michi");

        ArrayList<String> guestList = new ArrayList<>();

        guestList.add(guest.getName());
        guestList.add(guest1.getName());
        guestList.add(guest2.getName());
        System.out.println(guestList);

    }
}
