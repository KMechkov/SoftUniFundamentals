using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



public class Battery
{
    private string baterry;

    public string Baterry
    {
        get { return this.baterry; }
        set { baterry = value; }
    }
    private double baterryLife;

    public double BaterryLife
    {
        get { return this.baterryLife; }
        set { baterryLife = value; }
    }
    public Battery(string baterry,double baterryLife)
    {
        this.Baterry = baterry;
        this.BaterryLife = baterryLife;
    }
}

