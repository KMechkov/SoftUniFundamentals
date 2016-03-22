using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Point3DD;
using DistanceCalculator;

namespace Path
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Point3D point1 = new Point3D(0, 5, 1);
                Point3D point2 = new Point3D(-3, 20, 0);
                Path3D path = new Path3D(point1, point2);

                Storage.SavePathToFile("../../path.txt", path.ToString());
                Console.WriteLine("Load from file:\n" + Storage.LoadPathFromFile("../../path.txt"));
            }
            catch (Exception)
            {

                throw;
            }
        }
    }
}
