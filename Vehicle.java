/*
 * This class is a Vehicle blueprint.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2022-01-09
 */

/**
 * The class of a Vehicle.
 * */
public abstract class Vehicle {
    /**
     * The vehicle's speed.
     * */
    private int speed;
    /**
     * The vehicle's colour.
     * */
    private String colour;
    /**
     * The vehicle's max speed.
     * */
    private final int maxSpeed;
    /**
     * The vehicle's number of tires.
     * */
    private final int numOfTires;

    /**
     * Instantiates a Vehicle.
     *
     * @param newColour sets the colour
     * @param newMaxSpeed sets the max speed
     * @param theNumOfTires # of tires
     * */
    public Vehicle(
        final String newColour,
        final int newMaxSpeed,
        final int theNumOfTires
    ) {
        this.colour = newColour;
        this.maxSpeed = newMaxSpeed;
        this.numOfTires = theNumOfTires;
        this.speed = 0;
    }

    /**
     * Gets the car colour.
     *
     * @return the car colour
     * */
    public String getColour() {
        return this.colour;
    }

    /**
     * Sets the car colour.
     *
     * @param newColour the new car colour
     * */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
     * Gets the max speed.
     *
     * @return the max speed
     * */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the speed.
     *
     * @return the speed
     * */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Increases the speed.
     *
     * @param accelerateBy increase the speed by this amount
     * */
    public void accelerate(final int accelerateBy) {
        this.speed += accelerateBy;
    }

    /**
     * Decreases the speed.
     *
     * @param brakeBy decrease the speed by this amount
     * */
    public void brake(final int brakeBy) {
        this.speed -= brakeBy;
    }

    /**
     * Gets the num of tires.
     *
     * @return the num of tires
     */
    public int getNumOfTires() {
        return this.numOfTires;
    }
}

