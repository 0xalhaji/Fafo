public class Car
{
    private String brand;
    private int speed;
    private boolean isRunning;

    /**
     * Creates a new car
     *
     * @param brand the car's brand
     */

    public Car(String brand)
    {
        this.brand = brand;
    }

    /**
     * Starts the car.
     *
     */
    public void start()
    {
        isRunning = true;
        speed = 0;
    }

    /**
     * Stops the car and resets its speed to zero.
     */

    public void stop()
    {
        isRunning = false;
        speed = 0;
    }

    /**
     * Increases the car's speed if it is running.
     *
     * @param amount the amount by which to increase speed
     *
     */
    
    public void accelerate(int amount)
    {
        if (isRunning)
        {
            speed += amount;
        }
    }

    /**
     * Decreases the car's speed without going below zero.
     *
     * @param amount the amount by which to decrease speed
     *
     */

    public void brake(int amount)
    {
        if (speed > 0)
        {
            if (speed >= amount)
            {
                speed -= amount;
            }
            else
            {
                speed = 0;
            }
        }
    }

    /**
     * Returns the current speed.
     * 
     * @return the current speed
     */

    public int getSpeed()
    {
        return speed;
    }
}
