using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem01
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                uint number = uint.Parse(Console.ReadLine());
                Console.WriteLine(Math.Sqrt(number));
            }
            catch (ArgumentOutOfRangeException)
            {
                Console.WriteLine("Invalid Number");
            }
            catch (FormatException)
            {
                Console.WriteLine("Invalid Number");
            }
            catch (Exception)
            {
                    Console.WriteLine("Invalid Number");
            }
            finally
            {
                Console.WriteLine("Good Bye");
            }
        }
    }
}





