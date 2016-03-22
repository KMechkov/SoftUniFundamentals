using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Point3DD
{
    public class Program
    {
        static void Main(string[] args)
        {
            Point3D point = new Point3D(2.5, 3.5, 4.5);
            Console.WriteLine(point);
            Console.WriteLine();
            Console.WriteLine(Point3D.StartingCordinate);                       
        }
    }
}
