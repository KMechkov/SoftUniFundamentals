using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HumanStudenAndWorker
{
    class Worker : Human
    {
        private decimal weekSalary;
        private int workHoursPerDay;
        private decimal moneyperhour;

        public decimal Moneyperhour
        {
            get { return this.moneyperhour; }
            set { moneyperhour = value; }
        }

        public decimal WeekSalary
        {
            get { return this.weekSalary; }
            set { this.weekSalary = value; }
        }
        public int WorkHoursPerDay
        {
            get { return this.workHoursPerDay; }
            set { this.workHoursPerDay = value; }
        }

        public Worker(string firstName, string lastName, decimal weekSalary, int workHoursPerDay)
            : base(firstName, lastName)
        {
            this.WeekSalary = weekSalary;
            this.WorkHoursPerDay = workHoursPerDay;
        }
        public override string ToString()
        {
            moneyperhour = (this.weekSalary / 7) / this.workHoursPerDay;
            return string.Format("Worker - {0} {1} \nWeekSalary - {2:F2}lv. \nHours per day - {3}\nMoneyPerHour - {4:F2}v. \n ",
                this.FirstName, this.LastName, this.weekSalary, this.WorkHoursPerDay,this.moneyperhour);

        }






    }
}
