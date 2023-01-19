import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void newGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public static double calculateSize(double length, double width) {
        return length * width;
    }
}
