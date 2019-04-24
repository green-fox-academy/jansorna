package reservations;

public class Reservation implements Reservationy {
    String day;
    String code;

    public Reservation() {
        day = getDowBooking();
        code = getCodeBooking();
    }

    @Override
    public String getDowBooking() {
        int numberOfTheDay = 1 + (int) (Math.random() * 6);
        if (numberOfTheDay == 1) {
            return "MON";
        }
        if (numberOfTheDay == 2) {
            return "TUE";
        }
        if (numberOfTheDay == 3) {
            return "WED";
        }
        if (numberOfTheDay == 4) {
            return "THU";
        }
        if (numberOfTheDay == 5) {
            return "FRI";
        }
        if (numberOfTheDay == 6) {
            return "SAT";
        }
        if (numberOfTheDay == 7) {
            return "SUN";
        }
        return "Error";
    }

    @Override
    public String getCodeBooking() {
        String charsOfTheBooking = "ABCDEFGHIJKLMNOPQRTUVWXYZ0123456789";
        int lenghtOfCode = 8;
        code = "";

        for (int i = 0; i < lenghtOfCode; i++) {
            code += charsOfTheBooking.charAt((int) (Math.random() * (charsOfTheBooking.length()) - 1));
        }
        return code;
    }

    @Override
    public String toString() {
        return "Booking# " + code + " for " + day;
    }
}
