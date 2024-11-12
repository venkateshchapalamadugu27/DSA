import java.util.*;
public class HotelManagemant {
    static class Guest {
        private String name;
        private int roomNumber;

        public Guest(String name, int roomNumber) {
            this.name = name;
            this.roomNumber = roomNumber;
        }

        public String getName() {
            return name;
        }

        public int getRoomNumber() {
            return roomNumber;
        }
    }

     static class Hotel {
        private List<Guest> guests;

        public Hotel() {
            guests = new ArrayList<>();
        }

        public void checkIn(String guestName, int roomNumber) {
            Guest guest = new Guest(guestName, roomNumber);
            guests.add(guest);
            System.out.println(guestName + " checked into room " + roomNumber);
        }

        public void checkOut(String guestName) {
            for (Guest guest : guests) {
                if (guest.getName().equals(guestName)) {
                    System.out.println(guestName + " checked out of room " + guest.getRoomNumber());
                    guests.remove(guest);
                    return;
                }
            }
            System.out.println(guestName + " is not checked in.");
        }

        public void listGuests() {
            if (guests.isEmpty()) {
                System.out.println("No guests currently checked in.");
            } else {
                System.out.println("Guests currently checked in:");
                for (Guest guest : guests) {
                    System.out.println(guest.getName() + " - Room " + guest.getRoomNumber());
                }
            }
        }
    }

    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        hotel.listGuests();
        hotel.checkIn("Abdul", 101);
        hotel.checkIn("Hemanth", 102);
        hotel.checkIn("Venky", 103);
        hotel.checkIn("kumar", 104);

        hotel.listGuests();

        hotel.checkOut("Bob");

        hotel.listGuests();
    }
}
