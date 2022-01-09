/*
 * This is the Truck class.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2022-01-09
 */

/**
 * Truck class, extends Vehicle.
 * */
public class Truck extends Vehicle {
    /**
     * License Plate.
     * */
    private String licensePlate;

    /**
     * Instantiates a Truck.
     *
     * @param newColour the colour of the truck
     * @param newMaxSpeed the max speed
     * @param newLicensePlate the license plate
     * @param numOfTires # of tires
     * */
    public Truck(
        final String newColour,
        final int newMaxSpeed,
        final String newLicensePlate,
        final int numOfTires
    ) {
        super(newColour, newMaxSpeed, numOfTires);
        this.licensePlate = newLicensePlate;
    }

    /**
     * Gets license plate.
     *
     * @return licensePlate.
     * */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Sets license plate.
     *
     * @param newLicensePlate new license plate to set.
     */
    public void setLicensePlate(final String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * Divides speed by airQuantity.
     *
     * @param airQuantity quantity of air.
     * */
    public void provideAir(final int airQuantity) {
        super.speed /= airQuantity;
    }
}
