package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        double baseSpeed = 12.0;
        double loadFactor = 9.0;
        return Math.max(0, baseSpeed - loadFactor * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}