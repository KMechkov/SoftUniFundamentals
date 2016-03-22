using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.PC_Catalog
{
    class Program
    {
        static void Main(string[] args)
        {
            Components processor = new Components("Intel", 300);
            Components motherboard = new Components("Gygabyte", 150);
            Components ram = new Components("Kingston", 70);
            Components hdd = new Components("SATA", 100);
            Components graphicCard = new Components("Nvidia", 400);

            Computer computer = new Computer("Deluxe", processor, motherboard, ram, hdd, graphicCard);

            computer.TotalPrice();
            computer.PrintComputer();


            List<Computer> computers = new List<Computer>();
            computers.Add(new Computer("Deluxe", new Components("Intel", 300), new Components("Gygabyte", 150), new Components("Kingston", 70), new Components("SATA", 120), new Components("Nvidia", 400)));
            computers.Add(new Computer("Dell", new Components("AMD", 250), new Components("asrock", 250), new Components("Kingston", 170), new Components("SATA", 220), new Components("PowerColor", 600)));
            computers.Add(new Computer("Asus", new Components("XEON", 600), new Components("asus", 350), new Components("Kingston", 90), new Components("SATA", 90), new Components("Saphire", 300)));
            computers.Add(new Computer("Toshiba", new Components("Intel", 300), new Components("Gygabyte", 200), new Components("Kingston", 120), new Components("SATA", 120), new Components("Radeon7", 1000)));

            foreach (var comp in computers)
            {
                comp.TotalPrice();
            }

            computers.OrderByDescending(comp => comp.Price).ToList().ForEach(comp => Console.WriteLine("{0} - {1}", comp.Name, comp.Price));


        }
    }
}