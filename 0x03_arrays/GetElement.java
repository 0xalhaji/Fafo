/**
 * Get an element at a specified index
 *
 * @param scores Areay of integer type
 * @param index Position of element to return
 *
 * @return Return -1 if out of range otherwise the elment at the specified index
 *
 */

public class GetElement
{
    public static int getScore(int[] scores, int index)
    {
        if (index > scores.length - 1)
        {
            return -1;
        }
        return scores[index];
    }
}
