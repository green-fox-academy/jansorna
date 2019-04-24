package reservations;

public class Main {
    public static void main(String[] args) {

        // start testing
        ReservationSystem myReservationSystem = new ReservationSystem();

        int numberOfReservations = 50;

        for (int i = 0; i < numberOfReservations; i++) {
            myReservationSystem.addReservation(new Reservation());
        }

        myReservationSystem.printAllReservation();
        // end testing
    }
}
