﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Point3DD
{
    public class Point3D
    {
        private static readonly Point3D startingCordinate = new Point3D(0,0,0);
        private double x;
        private double y;
        private double z;

        public  static Point3D StartingCordinate { get { return Point3D.startingCordinate; } }
        
        public double X
        {
            get { return this.x; }
            set { this.x = value; }
        }
        public double Y
        {
            get { return this.y; }
            set { this.y = value; }
        }
        public double Z
        {
            get { return this.z; }
            set { this.z = value; }
        }

        public Point3D(double x,double y, double z)
        {
            this.X = x;
            this.Y = y;
            this.Z = z;
        }

        public override string ToString()
        {
            return string.Format("X = {0} \nY = {1} \nZ = {2}", this.x, this.y, this.z);
        }
    }
}
