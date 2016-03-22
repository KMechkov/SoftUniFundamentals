using System;

namespace _03.PC_Catalog
{
    public class Components
    {
        private string name;
        private string details;
        private decimal price;

        public Components(string name, string details, decimal price)
        {
            this.Name = name;
            this.Details = details;
            this.Price = price;
        }
        public Components(string name, decimal price)
            : this(name, null, price)
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
        public string Details
        {
            get
            {
                return this.details;
            }
            set
            {
                this.name = value;

            }
        }
        public decimal Price
        {
            get
            {
                return this.price;
            }
            set
            {
                if (value < 0)
                {
                    throw new ArgumentException("Price cannot be a negative number!");
                }
                else
                {
                    this.price = value;
                }
            }
        }

        public string[] ArraySight()
        {
            if (string.IsNullOrEmpty(details))
            {
                return new string[] { name, price.ToString() };
            }
            else
            {
                return new string[] { name, details, price.ToString() };
            }
        }
    }
}