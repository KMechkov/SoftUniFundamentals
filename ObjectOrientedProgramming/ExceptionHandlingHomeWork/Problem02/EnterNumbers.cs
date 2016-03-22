using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class EnterNumbers
{
    private static void Main()
    {
        const int start = 1;
        const int end = 100;
        const int counter = 10;
        ReadNumber(start, end, counter);
    }
    public static void ReadNumber(int start, int end, int counter)
    {
        int number = 0;
        Console.WriteLine("Enter {0} Integer numbers in the range [{1} <...< {2}]", counter, start, end);

        try
        {
            if (int.TryParse(Console.ReadLine(), out number))
            {
                if (number > start && number < end)
                {
                    Console.WriteLine("Number is correct\n");
                    counter--;

                    if (number == (end - 1))
                    {
                        Console.WriteLine("This was last possible number\n");
                        counter = 0;
                    }
                    start = number;
                }
                else
                {
                     throw new ArgumentOutOfRangeException("Number is out ot range.");
                }
            }              
            else
            {
                throw new FormatException("This is not Integer number"); 
            }
        }

        catch (FormatException)
        {
            Console.WriteLine("This is not Integer number");
        }
        catch (ArgumentException)
        {
            Console.WriteLine("Number is out ot range.");
        }
        finally
        {
            if (counter > 0)
            {
                ReadNumber(start, end, counter);
            }
            else
            {
                Console.WriteLine("The End");
            }
        }
    }
}
