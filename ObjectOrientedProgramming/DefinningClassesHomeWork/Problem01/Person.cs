﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Person
{
    private string name;
    private int age;
    private string email;

    public string Name 
    {
        get { return this.name; }
        set
        {
            if (string.IsNullOrEmpty(value))
            {
                throw new ArgumentNullException("Name cannot be empty");
            }
            this.name = value;
        }
    }
    public int Age 
    {
        get { return this.age; }
        set
        {
            if (value < 1 || value > 100)
            {
                throw new ArgumentException("Age should be in the range [1...100]");
            }
            this.age = value;
        }
    }
    public string Email 
    {
        get { return this.email; }
        set
        {
            if (!string.IsNullOrEmpty(value) && !value.Contains("@"))
            {
                throw new ArgumentException("Email should have @");
            }

            this.email = value;
        }
    }

    public Person(string name,int age,string email)
    {
        this.Name = name;
        this.Age = age;
        this.Email = email;
    }
    public Person(string name, int age)
        
    {
        this.Name = name;
        this.Age = age;
    }

    public override string ToString()
    {
        return string.Format("Name:{0} Age:{1} Email:{2}",this.Name,this.Age,
            string.IsNullOrEmpty(this.Email) ? "empty" : this.Email);
    }

}

