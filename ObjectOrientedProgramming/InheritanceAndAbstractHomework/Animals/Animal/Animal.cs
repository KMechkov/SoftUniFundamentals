using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animals.Interfaces;

namespace Animals
{
    public abstract class Animal : ISoundProductible 
    {
        private string name;
        private int age;
        private string gender;

        public string Name
        {
            get { return this.name; }
            set { this.name = value; }
        }
        public int Age
        {
            get { return this.age; }
            set { this.age = value; }
        }
        public virtual string Gender
        {
            get { return this.gender; }
            set { this.gender = value; }
        }
        public Animal(string name,int age,string gender)
        {
            this.Name = name;
            this.Age = age;
            this.Gender = gender;
        }
        public abstract void ProduceSound();
        public override string ToString()
        {
            return string.Format("Name: {0} \nAge: {1}\nGender: {2}", this.Name, this.Age, this.Gender);
        }


    }
}
