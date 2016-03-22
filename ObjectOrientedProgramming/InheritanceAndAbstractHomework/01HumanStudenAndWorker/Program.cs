using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HumanStudenAndWorker
{
    class Program
    {
        static void Main(string[] args)
        {        
            List<Student> students = new List<Student>();
            Student iordan = new Student("Iordan", "Iordanov",11111111);
            Student iordanka = new Student("Iordanka", "Iordankova",22222222);
            Student petranka = new Student("Petranka", "Petrankova",33333333);
            Student kirev = new Student("Kircho", "Kirev",44444444);
            Student rusanka = new Student("Rusanka", "Ruseva",55555555);
            Student stoqnka = new Student("Stoqnka", "Stoqnova",66666666);
            Student peshenceto = new Student("Peshenceto", "Peshencev",77777777);
            Student ginka = new Student("Ginka", "Gincheva",88888888);
            Student penka = new Student("Penka", "Penkova",99999999);
            Student dragan = new Student("Dragan", "Draganov",11111110);
            students.Add(iordan);
            students.Add(iordanka);   
            students.Add(stoqnka);
            students.Add(peshenceto);
            students.Add(ginka);
            students.Add(penka);
            students.Add(dragan);
            students.Add(petranka);
            students.Add(kirev);
            students.Add(rusanka);
            Console.WriteLine("Before sort");
            foreach (var student in students)
            {                
                Console.WriteLine(student);
            }
            List<Student> sortFacNumber = students.OrderBy(Student => Student.FacultyNumber).ToList();
            Console.WriteLine("------------------------------------");
            Console.WriteLine("After sort");
            foreach (var student in sortFacNumber)
            {
                Console.WriteLine(student);

            }
            Console.WriteLine("------------------------------------");

            List<Worker> workers = new List<Worker>();
            Worker Peshka = new Worker("Peshka", "Peshkov", 1000, 8);
            Worker Ivo = new Worker("Ivo", "Ivanov", 900, 8); 
            Worker Gosho = new Worker("Georgi", "Ivanov", 950, 8); 
            Worker Sasho = new Worker("Sasho", "Alexandrov", 850, 8); 
            Worker Petyr = new Worker("Petyr", "Stoyanov", 800, 8); 
            Worker Ivan = new Worker("Ivan", "Ivanov", 750, 8); 
            Worker Drago = new Worker("Drago", "Draganov", 700, 8); 
            Worker Petkan = new Worker("Petkan", "Petkanov", 650, 8); 
            Worker Veselin = new Worker("Veselin", "Stoyanov", 600, 8); 
            Worker Andrey = new Worker("Andrey", "Kostadinov", 555, 8);
            workers.Add(Peshka);
            workers.Add(Ivo);
            workers.Add(Gosho);
            workers.Add(Sasho);
            workers.Add(Petyr);
            workers.Add(Ivan);
            workers.Add(Drago);
            workers.Add(Petkan);
            workers.Add(Veselin);
            workers.Add(Andrey);
            Console.WriteLine("------------------------------------");
            Console.WriteLine("Before sort");
            foreach (var worker in workers)
            {
                Console.WriteLine(worker);
            }
            Console.WriteLine("After sort");
            Console.WriteLine("------------------------------------");
            List<Worker> sortWorker = workers.OrderBy(Worker => Worker.Moneyperhour).ToList();
            foreach (var worker in sortWorker)
            {
                Console.WriteLine(worker);
            }
            List<Human> studentsAndWorkers = new List<Human>();
            studentsAndWorkers.AddRange(workers);
            studentsAndWorkers.AddRange(students);
            Console.WriteLine("\nStudents and Workers sortet by Firstname:\n");
            foreach (var human in studentsAndWorkers.OrderBy(u => u.FirstName))
            {
                Console.WriteLine("{0} {1}",human.FirstName,human.LastName);
            }
            Console.WriteLine("\nStudents and Workers sortet by LastName:\n");
            foreach (var human in studentsAndWorkers.OrderBy(u => u.LastName))
            {
                Console.WriteLine("{0} {1}", human.FirstName, human.LastName);
            }
        }
    }
}
