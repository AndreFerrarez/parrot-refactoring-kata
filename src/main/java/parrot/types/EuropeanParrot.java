package parrot.types;

import parrot.Parrot;

public class EuropeanParrot extends Parrot {

    private static final double BASE_SPEED = 12.0;

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}