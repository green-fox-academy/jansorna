package reservations;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    List<Reservation> storageOfReservations;

    public ReservationSystem() {
        storageOfReservations = new ArrayList<>();
    }

    public void addReservation(Reservation confirmedReservation) {
        storageOfReservations.add(confirmedReservation);
    }

    public void printAllReservation() {
        for (Reservation inspectedReservation : storageOfReservations) {
            System.out.println(inspectedReservation.toString());
        }
    }
}
