public class Counter
{
    private int value;

    /**
     * Creates a counter starting at zero.
     */
    public Counter()
    {
        this.value = 0;
    }

    /**
     * Increases counter by one
     */
    public void increment()
    {
        value++;
    }

    /**
     * Decreases the counter by one if the value is greater than zero.
     */
    public void decrement()
    {
        if ((value - 1) > 0)
        {
            value--;
        }
    }

    /**
     * Increases the counter by the specified positive amount
     * 
     * @param amount the amount to increase
     *
     */

    public void incrementBy(int amount)
    {
        if (amount > 0)
        {
            value += amount;
        }
    }

    /**
     * Resets the counter to zero.
     *
     */

    public void reset()
    {
        value = 0;
    }

    /**
     * Returns the current value of counter value.
     *
     * @return the curent value
     */

    public int getValue()
    {
        return value;
    }
}
