using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace HumanStudenAndWorker
{
    class Student : Human
    { 
        private long facultyNumber;

        public long FacultyNumber
        {
            get { return this.facultyNumber; }
            set
            {
                if (value < 10000 || value > 9999999999)
                {
                    throw new ArgumentOutOfRangeException("Faculty number should be in the range [10000...9999999999");
                }
                this.facultyNumber = value;
            }
        }

        public Student(string firstName, string lastName, long facultyNumber)
            : base(firstName, lastName)
        {
            this.FacultyNumber = facultyNumber;
        }
        public override string ToString()
        {
            return string.Format("Student: {0} {1} Fac num:{2}", this.FirstName, this.LastName, this.FacultyNumber);
        }
    }
}
