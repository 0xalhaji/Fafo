/**
 * Compute fibonnaci sequence.
 * The sequence is the sum of the previous two numbers
 *
 * @param previous Integer type
 * @param current Integer type
 *
 */


public class Fibonacci
{
    public void generateSeries(int previous, int current, int end)
    {
        System.out.print(previous + " " + current);
        
        for (int i = 0; i < end; i++)
        {
            int next = previous + current;
            System.out.print(" " + next);
            previous = current;
            current = next;
        }
        System.out.println();
    }
}
