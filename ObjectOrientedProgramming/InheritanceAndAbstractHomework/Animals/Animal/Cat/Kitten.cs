using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    public class Kitten : Cat
    {

        private string gender;

        public Kitten(string name,int age,string gender)
            : base(name,age,gender)
        {
        }

        public override string Gender
        {
            get {return this.gender = "Female";}
 
        }
       
    }
}
