package model;

public class Ticket {
    private int distance;
    private int agePassenger;
    private static final double PRICE_FOR_KM = 0.21;
    private static final double DISCOUNT_MINOR = 0.2;
    private static final double DISCOUNT_ELDERLY = 0.4;

    public Ticket(int distance, int agePassenger) throws IllegalArgumentException {
        if (distance == 0 || agePassenger == 0) {
            throw new IllegalArgumentException("0 is not an option");
        } else if (distance < 0 || agePassenger < 0) {
            throw new IllegalArgumentException("no negative numbers");
        }
        this.distance = distance;
        this.agePassenger = agePassenger;
    }

    private double getFullPrice() {
        return distance * PRICE_FOR_KM;
    }

    public double getPrice() {
        if (agePassenger < 18) {
            return getFullPrice() * DISCOUNT_MINOR;
        } else if (agePassenger > 65) {
            return getFullPrice() * DISCOUNT_ELDERLY;
        } else {
            return getFullPrice();
        }
    }
}
