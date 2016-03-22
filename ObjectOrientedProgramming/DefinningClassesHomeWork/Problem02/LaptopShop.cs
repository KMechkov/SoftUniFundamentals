using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem02
{
    class LaptopShop
    {
        static void Main(string[] args)
        {
            Laptop firstMacbook = new Laptop("HP 250 G2", 699);

            Laptop secondMacbook = new Laptop("Toshiba Satelite", 499, "Toshiba", "Intel Core i5-4210U (2-core, 1.70 - 2.70 GHz, 3MB cache)", 8, "Intel HD Graphics 4400"
                ,"128 GB SSD","13.3\" (33.78 cm) – 3200 x 1800 (QHD+), IPS sensor display",new Battery("Li-Ion, 4-cells, 2550 mAh",4.5));


            Console.WriteLine(firstMacbook);
            Console.WriteLine(secondMacbook);
        }
        
    }
}
