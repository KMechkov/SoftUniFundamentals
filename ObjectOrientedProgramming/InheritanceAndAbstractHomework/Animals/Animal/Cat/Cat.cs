using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animals.Interfaces;

namespace Animals
{
    public  class Cat : Animal
    {
        public Cat(string name,int age,string gender)
            : base(name,age,gender)
        {

        }
        public override void ProduceSound()
        {
            Console.WriteLine("The Cat {0} said: Mquuuuuuuuuuu !",this.Name);
        }
        
        
    }
}
