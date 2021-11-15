package ru.pro.sky;

public class Employee {
        private  String fullname;
        private int branch;
        private double salary;
        private int id;
        static int idCounter;


        public Employee(String surname , String firstName, String secondName, int branch, double salary) {
            this.fullname = surname + " " + firstName  + " " + secondName;
            this.branch = branch;
            this.salary = salary;
            this.id = idCounter+1;
            idCounter++;
        }

        public String toString() {
            return "ФИО сотрудника: " + fullname + " № отдела: " + branch + " Зарплата: " + salary;
        }

        public String getFullname() {
            return fullname;
        }

        public int getBranch() {
            return branch;
        }

        public double getSalary() {
            return salary;
        }

        public int getId() {
            return this.id;
        }

        public void setBranch(int branch) {
            this.branch = branch;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

    }

