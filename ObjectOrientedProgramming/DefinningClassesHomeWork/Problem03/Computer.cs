using System;


namespace _03.PC_Catalog
{
    public class Computer
    {
        private string name;
        private Components processor;
        private Components motherboard;
        private Components ram;
        private Components hdd;
        private Components graphicsCard;
        private decimal price;
        private int totalSum = 0;

        public Computer(string name, Components processor, Components motherboard, Components ram, Components hdd, Components graphicsCard)
        {
            this.Name = name;
            this.Processor = processor;
            this.MotherBoard = motherboard;
            this.Ram = ram;
            this.Hdd = hdd;
            this.GraphicsCard = graphicsCard;


        }
        public Computer(string name, Components processor, Components ram, Components graphicsCard)
            : this(name, processor, null, ram, null, graphicsCard)
        {

        }
        public string Name
        {
            get
            {
                return this.name;
            }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("You should type a name!");
                }
                else
                {
                    this.name = value;
                }
            }
        }
        public Components Processor
        {
            get
            {
                return this.processor;
            }
            set
            {

                this.processor = value;

            }
        }
        public Components MotherBoard
        {
            get
            {
                return this.motherboard;
            }
            set
            {

                this.motherboard = value;

            }
        }
        public Components Ram
        {
            get
            {
                return this.ram;
            }
            set
            {

                this.ram = value;

            }
        }
        public Components Hdd
        {
            get
            {
                return this.hdd;
            }
            set
            {

                this.hdd = value;

            }
        }
        public Components GraphicsCard
        {
            get
            {
                return graphicsCard;
            }
            set
            {

                this.graphicsCard = value;

            }
        }
        public decimal Price
        {
            get
            {
                return totalSum;
            }

        }
        public int TotalPrice()
        {


            if (processor != null)
            {
                totalSum += int.Parse(processor.ArraySight()[1]);
            }
            if (motherboard != null)
            {
                totalSum += int.Parse(motherboard.ArraySight()[1]);
            }
            if (ram != null)
            {
                totalSum += int.Parse(ram.ArraySight()[1]);
            }
            if (hdd != null)
            {
                totalSum += int.Parse(hdd.ArraySight()[1]);
            }
            if (graphicsCard != null)
            {
                totalSum += int.Parse(graphicsCard.ArraySight()[1]);
            }
            return totalSum;
        }

        public void PrintComputer()
        {
            Console.WriteLine(name);
            if (processor != null)
            {
                if (processor.ArraySight().Length == 2)
                {
                    Console.WriteLine("{0} - {1} lv", processor.ArraySight()[0], processor.ArraySight()[1]);
                }
                else
                {
                    Console.WriteLine("{0} - {1} - {2} lv", processor.ArraySight()[0], processor.ArraySight()[1], processor.ArraySight()[2]);
                }

            }
            if (motherboard != null)
            {

                if (motherboard.ArraySight().Length == 2)
                {
                    Console.WriteLine("{0} - {1} lv", motherboard.ArraySight()[0], motherboard.ArraySight()[1]);
                }
                else
                {
                    Console.WriteLine("{0} - {1} - {2} lv", motherboard.ArraySight()[0], motherboard.ArraySight()[1], motherboard.ArraySight()[2]);
                }
            }
            if (ram != null)
            {
                if (ram.ArraySight().Length == 2)
                {
                    Console.WriteLine("{0} - {1} lv", ram.ArraySight()[0], ram.ArraySight()[1]);
                }
                else
                {
                    Console.WriteLine("{0} - {1} - {2} lv", ram.ArraySight()[0], ram.ArraySight()[1], ram.ArraySight()[2]);
                }

            }
            if (hdd != null)
            {
                if (hdd.ArraySight().Length == 2)
                {
                    Console.WriteLine("{0} - {1} lv", hdd.ArraySight()[0], hdd.ArraySight()[1]);
                }
                else
                {
                    Console.WriteLine("{0} - {1} - {2} lv", hdd.ArraySight()[0], hdd.ArraySight()[1], hdd.ArraySight()[2]);
                }

            }
            if (graphicsCard != null)
            {
                if (graphicsCard.ArraySight().Length == 2)
                {
                    Console.WriteLine("{0} - {1} lv", graphicsCard.ArraySight()[0], graphicsCard.ArraySight()[1]);
                }
                else
                {
                    Console.WriteLine("{0} - {1} - {2} lv", graphicsCard.ArraySight()[0], graphicsCard.ArraySight()[1], graphicsCard.ArraySight()[2]);
                }
            }
            Console.WriteLine(totalSum + "lv");
        }
    }
}