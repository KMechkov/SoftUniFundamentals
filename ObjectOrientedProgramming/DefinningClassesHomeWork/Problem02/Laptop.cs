using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Laptop
{
    private string model;
    private Battery batteryLaptop;

    public Battery BatteryLaptop 
    { get; set; }

    public string Model
    {
        get { return this.model; }
        set
        {
            if (string.IsNullOrWhiteSpace(value))
            {
                throw new ArgumentNullException("model cannot be empty");
            }
            this.model = value;
        }
    }
    private string manufacturer;

    public string Manufacturer
    {
        get { return this.manufacturer; }
        set { this.manufacturer = value; }
    }
    private string processor;

    public string Processor
    {
        get { return this.processor; }
        set { this.processor = value; }
    }
    private int ram;

    public int Ram
    {
        get { return this.ram; }
        set { this.ram = value; }
    }
    private string graphicsCard;

    public string GraphicsCard
    {
        get { return this.graphicsCard; }
        set { this.graphicsCard = value; }
    }
    private string hdd;

    public string Hdd
    {
        get { return this.hdd; }
        set { this.hdd = value; }
    }
    private string screen;

    public string Screen
    {
        get { return this.screen; }
        set { this.screen = value; }
    }
    private decimal price;

    public decimal Price
    {
        get { return this.price; }
        set
        {
            if (value <0)
            {
                throw new ArgumentException("Price cannot be negative");
            }
            { this.price = value; }
        }
    }

    public Laptop(string model, decimal price)
    {
        this.Model = model;
        this.Price = price;
    }
    public Laptop(string model, decimal price, string manufacturer)
        : this(model, price)
    {
        this.Manufacturer = manufacturer;
    }
    public Laptop(string model, decimal price, string manufacturer, string processor)
        : this(model, price, manufacturer)
    {
        this.Processor = processor;
    }
    public Laptop(string model, decimal price, string manufacturer, string processor, int ram)
        : this(model, price, manufacturer,processor)
    {
        this.Ram = ram;
    }
    public Laptop(string model, decimal price, string manufacturer, string processor, int ram, string graphicsCard)
        : this(model, price, manufacturer, processor,ram)
    {
        this.GraphicsCard = graphicsCard;
    }
    public Laptop(string model, decimal price, string manufacturer, string processor, int ram, string graphicsCard, string hdd)
        : this(model, price, manufacturer, processor, ram,graphicsCard)
    {
        this.Hdd = hdd;
    }
    public Laptop(string model, decimal price, string manufacturer, string processor, int ram, string graphicsCard, string hdd,
        string screen)
        : this(model, price, manufacturer, processor,ram, graphicsCard, hdd)
    {
        this.Screen = screen;
    }
   
    public Laptop(string model, decimal price, string manufacturer, string processor,int ram, string graphicsCard, string hdd,
        string screen, Battery batteryLaptop) : 
        this( model,  price,  manufacturer,  processor,ram,  graphicsCard,  hdd,
         screen)
    {
        this.BatteryLaptop = batteryLaptop;
    }

    public override string ToString()
    {
        string str = string.Format("model {0} \n", this.model);

        if (!string.IsNullOrEmpty(manufacturer))
        {
            str += string.Format("manufacturer {0} \n",this.manufacturer);
        }
        if (!string.IsNullOrEmpty(processor))
        {
            str += string.Format("processor {0} \n", this.processor);
        }
        if (ram > 0)
        {
            str += string.Format("RAM {0} GB \n", this.ram);
        }
        if (!string.IsNullOrEmpty(graphicsCard))
        {
            str += string.Format("graphics card {0}\n",this.graphicsCard);
        }
        if (!string.IsNullOrEmpty(hdd))
        {
            str += string.Format("HDD {0} \n",this.hdd);
        }
        if (!string.IsNullOrEmpty(screen))
        {
            str += string.Format("screen {0} \n", this.screen);
        }
       
       
        if (BatteryLaptop != null)
        {
            str += string.Format("battery {0} \nbattery life {1} hours\n",BatteryLaptop.Baterry,BatteryLaptop.BaterryLife);
        }
        if (price > 0)
        {
            str += string.Format("price {0:F2} lv. \n", this.price);
        }

        return str;
    }
}
