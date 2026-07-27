import java.util.List;
import java.util.ArrayList;


public class Hailstone
{
    /**
     * Compute a hailstone sequence.
     * @param n  Starting number for sequence. Assume n > 0.
     * @return Hailstone sequence starting with n and ending with 1.
     */

    public static List<Integer> hailstoneSequence(int n)
    {
        List<Integer> list = new ArrayList<Integer>();

        while (n != 1)
        {
            list.add(n);
            if (n % 2 == 0)
            {
                n /= 2;
            }
            else
            {
                n = 3 * n + 1;
            }
        }
        list.add(n);
        return list;
    }
}
