using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Point3DD;

namespace DistanceCalculator
{
    public static class DistanceCalculator
    {
        public static void Distance(Point3D one,Point3D two)
        {
            double deltaX = one.X - two.X;
            double deltaY = one.Y - two.Y;
            double deltaZ = one.Z - two.Z;
            double distance = (Math.Sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ));
            Console.WriteLine(distance);
        }
    }
}
