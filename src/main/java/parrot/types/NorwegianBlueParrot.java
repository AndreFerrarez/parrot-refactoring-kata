package parrot.types;

import parrot.Parrot;
import parrot.ParrotAttributes;

public class NorwegianBlueParrot extends Parrot {

    private static final double BASE_SPEED = 12.0;
    private static final double MAX_SPEED = 24.0;

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(ParrotAttributes attributes) {
        this.voltage = attributes.getVoltage();
        this.isNailed = attributes.isNailed();
    }

    @Override
    public double getSpeed() {
        if (isNailed) {
            return 0;
        }
        double calculatedSpeed = voltage * BASE_SPEED;
        return Math.min(MAX_SPEED, calculatedSpeed);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}