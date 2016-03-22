using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Persons
{
    static void Main(string[] args)
    {
        Person firstHuman = new Person("Pesho",25);

        Person secondHuman = new Person("Ivo",20,"ivo92@gmail.com");

        Console.WriteLine(firstHuman);
        Console.WriteLine(secondHuman);    
    }
}

