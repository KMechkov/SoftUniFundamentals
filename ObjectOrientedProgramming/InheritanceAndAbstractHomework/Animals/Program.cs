using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animals.Interfaces;

namespace Animals
{
    class Program
    {
        static void Main(string[] args)
        {
            //Cat gosho = new Cat("Gosho",20,"Male");
            //Console.WriteLine(gosho);
            //Kitten Peshka = new Kitten("Peshka", 21, "Male");
            //Console.WriteLine(Peshka);
            //Tomcat Slavi = new Tomcat("Slavi Trifonov", 59, "Female");
            //Console.WriteLine(Slavi);
            //Frog frogi = new Frog("Frogi", 15, "Male");
            //Dog dogi = new Dog("Dogi", 50, "Male");

            Animal[] animals = new Animal[9];
            animals[0] = new Cat("Pisiu", 15, "Male");
            animals[1] = new Cat("Sara", 10, "Female");
            animals[2] = new Cat("Fredy", 20, "Male");
            animals[3] = new Dog("Rex", 10, "Male");
            animals[4] = new Dog("Max", 15, "Ma;e");
            animals[5] = new Dog("Cvetan", 20, "Male");
            animals[6] = new Frog("Jabcho", 5, "Male");
            animals[7] = new Frog("Jabka", 10, "Female");
            animals[8] = new Frog("Jabincho", 30, "Male");

            double averageCat = 0;
            double averageDog = 0;
            double averageFrog = 0;
            int catsCount =0;
            int dogsCount = 0;
            int frogsCount = 0;

            for (int i = 0; i < animals.Length; i++)
            {
                animals[i].ProduceSound();
                if (animals[i].GetType().ToString()== "Animals.Cat")
                {
                    averageCat += animals[i].Age;
                    catsCount ++;
                }
                if (animals[i].GetType().ToString() == "Animals.Dog")
                {
                    averageDog += animals[i].Age;
                    dogsCount++;
                }
                if (animals[i].GetType().ToString() == "Animals.Frog")
                {
                    averageFrog += animals[i].Age;
                    frogsCount++;
                }  
            }
            Console.WriteLine("Average of Cats is: {0} \nAverage of Dogs is: {1} \nAverage of Frogs is: {2}"
                ,averageCat/catsCount,averageDog/dogsCount,averageFrog/frogsCount);
        }
    }
}
