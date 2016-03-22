using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Point3DD;

namespace DistanceCalculator
{
   public class Program 
    {
        static void Main(string[] args)
        {
            Point3D point = new Point3D(-7, -4, 3);
            Point3D point2 = new Point3D(17, 6, 2.5);

            DistanceCalculator.Distance(point, point2);
        }
    }
}
