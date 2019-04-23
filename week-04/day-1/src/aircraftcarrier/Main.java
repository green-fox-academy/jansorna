package aircraftcarrier;

public class Main {
    public static void main(String[] args) {

        F16 firstF16 = new F16();
        F16 secondF16 = new F16();
        F16 thirdF16 = new F16();
        F16 fourthF16 = new F16();

        F35 firstF35 = new F35();
        F35 secondF35 = new F35();
        F35 thirdF35 = new F35();
        F35 fourthF35 = new F35();

        Carrier firstCarier = new Carrier(5100, 2000);
        Carrier secondCarier = new Carrier(100, 11);

        firstCarier.add(firstF16);
        firstCarier.add(firstF35);

        firstCarier.add(secondF16);
        firstCarier.add(secondF35);

        secondCarier.add(thirdF16);
        secondCarier.add(thirdF35);

        secondCarier.add(fourthF16);
        secondCarier.add(fourthF35);

        firstCarier.getStatus();
        secondCarier.getStatus();

        firstCarier.fill();
        secondCarier.fill();

        firstCarier.getStatus();
        secondCarier.getStatus();




    }
}
