package ru.pro.sky;

public class Main {
    //Базовая сложность
    private static Employee[] employees = new Employee[10];

    public static void printArray (Employee [] employees) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] !=null ){
                System.out.println(employees[i]);
            }else {
                break;
            }
        }
    }
    public static void calculateSalarySum(Employee[] employees) {
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                total += employees[i].getSalary();
            if (employees[i] == null) {
                break;
            }
        }System.out.println("Сумма зарплат: "+ (float)total);
    }

    public static void minSalaryPrint(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length ; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        } System.out.println("Минимальная зарплата: "+ minSalary);
    }


    public static void maxSalaryPrint(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length ; i++) {
            if (employees[i]!= null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }System.out.println("Максимальная зарплата: "+ maxSalary);
    }

    public static void averageSalaryPrint(Employee[] employees) {
        double average = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                average = (average + employees[i].getSalary() / employees.length);
            if (employees[i] == null) {
                break;
            }
        }System.out.println("Средняя сумма зарплат: "+ (float)average);
    }

    public static void fullNamePrint(Employee[] employees) {
        String fullNameList;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                fullNameList = employees[i].getFullname();
                System.out.println("Вывод полного ФИО: " + fullNameList);
            }
        }
    }

    // Повышенная сложность
    public static void salaryIndexing(int percent) {
        double increasedSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            increasedSalary = employees[i].getSalary() + ((employees[i].getSalary()/100)*percent);
            System.out.println("Проиндексированная зарплата сотрудника: " + employees[i].getFullname() + " - " + (float) increasedSalary);
        }
    }

    public static void main(String[] args) {
        //Базовая сложность
        Employee employee1 = new Employee("Иванов", "Петр", "Иванович", 1, 63500.55);
        Employee employee2 = new Employee("Дмитриев","Михайил", "Павлович", 2, 34500.88);
        Employee employee3 = new Employee("Краснов", "Павел", "Вячеславович", 3, 72400.45);
        Employee employee4 = new Employee("Дегтярев", "Семен", "Александрович", 4, 97345.84);
        Employee employee5 = new Employee("Тарасов", "Алексей", "Дмитриевич", 5, 66874.45);
        Employee employee6 = new Employee("Павлов", "Андрей", "Александрович", 3, 25845.55);
        Employee employee7 = new Employee("Валенок", "Зинаида", "Викторовна", 4, 37025.66);
        Employee employee8 = new Employee("Павлова", "Анастасия", "Олеговна", 2, 77885.36);
        Employee employee9 = new Employee("Лихачева", "Татьяна", "Петровна", 1, 5311.25);
        Employee employee10 = new Employee("Тарасова", "Мария", "Александров", 3, 37000);

        System.out.println(employee4.getSalary());

        employee1.setSalary(280000);

        System.out.println(employee1.getSalary());


        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;


        printArray(employees);

        calculateSalarySum(employees);

        minSalaryPrint(employees);

        maxSalaryPrint(employees);

        averageSalaryPrint(employees);

        fullNamePrint(employees);


        //Повышенная сложность

        salaryIndexing(5);
    }
    }

