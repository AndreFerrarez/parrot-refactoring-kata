package parrot;

public class AfricanParrot extends Parrot {

    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;

    private final int numberOfCoconuts;

    public AfricanParrot(ParrotAttributes attributes) {
        this.numberOfCoconuts = attributes.getNumberOfCoconuts();
    }

    @Override
    public double getSpeed() {
        double burden = LOAD_FACTOR * numberOfCoconuts;
        double adjustedSpeed = BASE_SPEED - burden;
        return Math.max(0, adjustedSpeed);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}