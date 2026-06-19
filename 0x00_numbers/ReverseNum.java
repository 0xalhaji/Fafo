/**
 * Reverse a number
 * @param digit: Integer type
 *
 * @return: Reversed number e.g, digit = 1234, program returns 4321.
 *
 */

public class ReverseNum
{
    public int reverse(int digit)
    {
        int temp = 0;
        
        while (digit != 0)
        {
            int lastDigit = digit % 10;
            temp = temp * 10 + lastDigit;
            digit = digit / 10;
        }
        return temp;
    }
}
