/**
 * Filter an array
 *
 * @param scores An array of integer
 * @param passingMark Integer type
 *
 * @return null on error otherwise a new array of filtered elements
 *
 *
 */

public class FilterArray
{
    public static int[] filterPassed(int[] scores, int passingMark)
    {
        if (scores == null)
        {
            return null;
        }

        int count = 0;
        for (int score : scores)
        {
            if (score >= passingMark)
            {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;

        for (int score : scores)
        {
            if (score >= passingMark)
            {
                arr[i] = score;
                i++;
            }
        }
        return arr;
    }
}
