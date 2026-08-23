public class Temperature
{
    private double celsius;

    /**
     * Creates a temperature in celsius
     *
     * @param celsius the initial temperature
     */
    public Temperature(double celsius)
    {
        this.celsius = celsius;
    }

    /**
     * Returns the temperature in celsius.
     *
     * @return the temperature in celsius
     */

    public double getCelsius()
    {
        return celsius;
    }

    /**
     * Converts the temperature to fahrenheit.
     *
     * @return the temperature in fahrenheit
     */
    public double getFahrenheit()
    {
        return celsius * 1.8 + 32;
    }

    /**
     * Increases the temperature.
     *
     * @return amount the amount to increase
     */
    public void increase(double amount)
    {
        celsius += amount;
    }

    /**
     * Decrease the temperature without going below absolute zero.
     *
     * @param amount the amount to decrease
     */
    public void decrease(double amount)
    {
       celsius = celsius - amount > -273.15 ? celsius - amount : -273.15;
    }

    /**
     * Determines whether the temperature is at or below freezing.
     *
     * @return boolean isFreezing
     */
    public boolean isFreezing()
    {
        return celsius <= 0;
    }
}
