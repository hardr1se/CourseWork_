package Upper_Intermediate;

public class EmployeeBook {
    private static int id;
    private String fullName;
    private int division;
    private float salary;
    private static int id() {
        id++;
        return id;
    }
    public EmployeeBook(String fullName, int division, float salary) {
        this.fullName = fullName;
        this.division = division;
        this.salary = salary;
    }
    private static EmployeeBook[] people = new EmployeeBook[10];

    static  {
        EmployeeBook person1 = new EmployeeBook("Петров Петр Петрович", 2, 25_000);
        EmployeeBook person2 = new EmployeeBook("Павлов Павел Павлович", 3, 35_000);
        EmployeeBook person3 = new EmployeeBook("Алексеев Алексей Алексеевич", 4, 22_000);
        EmployeeBook person4 = new EmployeeBook("Николаев Николай Николаевич", 1, 39_000);
        EmployeeBook person5 = new EmployeeBook("Александров Александр Александрович", 5, 31_000);
        EmployeeBook person6 = new EmployeeBook("Павлов Павел Павлович", 3, 28_000);
        EmployeeBook person7 = new EmployeeBook("Алексеев Алексей Алексеевич", 3, 32_000);
        EmployeeBook person8 = new EmployeeBook("Николаев Николай Николаевич", 2, 32_000);
        EmployeeBook person9 = new EmployeeBook("Александров Александр Александрович", 1, 19_000);
        EmployeeBook person10 = new EmployeeBook("Витальев Виталий Витальевич", 2, 28_000);

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        people[5] = person6;
        people[6] = person7;
        people[7] = person8;
        people[8] = person9;
        people[9] = person10;
    }

    public void newEmployee() {
        EmployeeBook newEmployee = new EmployeeBook("Семенов Семен Семенович", 3, 20_000);
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = newEmployee;
            }
        }
    }

    public static void printAllSortedByDivisions() {
        System.out.println("Сотрудники из 1 отдела");
        for (EmployeeBook person : people) {
            if (person.division == 1) {
                System.out.println(person.fullName);
            }
        }
        System.out.println("\nСотрудники из 2 отдела");
        for (EmployeeBook person : people) {
            if (person.division == 2) {
                System.out.println(person.fullName);
            }
        }
        System.out.println("\nСотрудники из 3 отдела");
        for (EmployeeBook person : people) {
            if (person.division == 3) {
                System.out.println(person.fullName);
            }
        }
        System.out.println("\nСотрудники из 4 отдела");
        for (EmployeeBook person : people) {
            if (person.division == 4) {
                System.out.println(person.fullName);
            }
        }
        System.out.println("\nСотрудники из 5 отдела");
        for (EmployeeBook person : people) {
            if (person.division == 5) {
                System.out.println(person.fullName);
            }
        }
    }

    public static void deleteEmployeeFromTheArray() {
        String employeeThatNeedToDelete = "Витальев Виталий Витальевич";
        int idOfThePersonThatNeedToDelete = 5;
        for (int i = 0; i < people.length; i++) {

            if (people[i].fullName.equals(employeeThatNeedToDelete) || id == idOfThePersonThatNeedToDelete) {
                people[i] = null;
            }
        }
    }

    public static void makeSomeCorrectionsSalary() {
        String fullNameOfEmployee = "Павлов Павел Павлович";
        float newSalary = 25_000; // если указано 0, то зарплата не будет меняться
        int newDivision = 0; // если указано 0, то отдел не будет меняться
        for (EmployeeBook person : people) {
            if (person.fullName.equals(fullNameOfEmployee) && newSalary != 0) {
                person.salary = newSalary;
            }
        }
    }

    public static void makeSomeCorrectionsDivision() {
        String fullNameOfEmployee = "Павлов Павел Павлович";
        int newDivision = 0; // если указано 0, то отдел не будет меняться
        for (EmployeeBook person : people) {
            if (person.fullName.equals(fullNameOfEmployee) && newDivision != 0) {
                person.division = newDivision;
            }
        }
    }

    @Override
    public String toString() {
        id = id();
        return "id: " + id + ", ФИО работника: " + fullName + ", отдел: " + division + ", зарплата: " + salary;
    }

// Методы из прошлых задач

    public void printAll() {
        System.out.println("Список всех сотрудников со всеми данными");
        for (EmployeeBook person : people) {
            System.out.println("id: " + id() + ", " + person);
        }
    }

    public void monthlyExpenses() {
        float monthlyExpenses = 0;
        for (EmployeeBook person : people) {
            monthlyExpenses += person.salary;
        }
        System.out.println("\nСумма затрат на зарплаты за месяц составляет " + monthlyExpenses + " рублей");
    }

    public void minSalary() {
        float minSalary = Integer.MAX_VALUE;
        int minSalaryEmployee = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].salary < minSalary) {
                minSalaryEmployee = i;
                minSalary = people[i].salary;
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой: " + people[minSalaryEmployee]);
    }

    public void maxSalary() {
        float maxSalary = Integer.MIN_VALUE;
        int maxSalaryEmployee = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].salary > maxSalary) {
                maxSalaryEmployee = i;
                maxSalary = people[i].salary;
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой: " + people[maxSalaryEmployee]);
    }
    public void middleSalary() {
        float monthlyExpenses = 0;
        for (EmployeeBook person : people) {
            monthlyExpenses += person.salary;
        }
        System.out.println("\nСреднее значение зарплат равняется " + monthlyExpenses/people.length + " рублям в месяц");
    }

    public void printTheFullNameOfEveryEmployee() {
        System.out.println("\nСписок ФИО всех сотрудников");
        for (EmployeeBook person : people) {
            System.out.println("ФИО работника: " + person.fullName);
        }
    }
    public void minSalary(int certainDivision) {
        float minSalary = Integer.MAX_VALUE;
        int minSalaryEmployee = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].division == certainDivision) {
                if (people[i].salary < minSalary) {
                    minSalaryEmployee = i;
                    minSalary = people[i].salary;
                }
            }
        }
        System.out.println("\nСотрудник " + certainDivision + " отдела с минимальной зарплатой: " + people[minSalaryEmployee]);
    }

    public void maxSalary(int certainDivision) {
        float maxSalary = Integer.MIN_VALUE;
        int maxSalaryEmployee = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].division == certainDivision) {
                if (people[i].salary > maxSalary) {
                    maxSalaryEmployee = i;
                    maxSalary = people[i].salary;
                }
            }
        }
        System.out.println("\nСотрудник " + certainDivision + " отдела с максимальной зарплатой: " + people[maxSalaryEmployee]);
    }

    public void monthlyExpenses(int certainDivision) {
        float monthlyExpenses = 0;
        for (EmployeeBook person : people) {
            if (person.division == certainDivision) {
                monthlyExpenses += person.salary;
            }
        }
        System.out.println("\nСумма затрат на зарплаты " + certainDivision + " отделу за месяц составляет " + monthlyExpenses + " рублей");
    }

    public void middleSalary(int certainDivision) {
        float monthlyExpenses = 0;
        int employeeCertainDivision = 0;
        for (EmployeeBook person : people) {
            if (person.division == certainDivision) {
                monthlyExpenses += person.salary;
                employeeCertainDivision++;
            }
        }
        System.out.println("\nСреднее значение зарплат " + certainDivision + " отдела равняется " + monthlyExpenses/employeeCertainDivision + " рублям");
    }

    public void profitSalaryForCertainDivision(int certainDivision, int indexPercentForCertainDivision) {
        for (EmployeeBook person : people) {
            if (person.division == certainDivision) {
                person.salary = person.salary * (100 + indexPercentForCertainDivision) / 100;
            }
        }
    }

    public void printAll(int certainDivision) {
        System.out.println("\nСотрудники " + certainDivision + " отдела:");
        for (EmployeeBook person : people) {
            if (person.division == certainDivision) {
                System.out.println("ФИО работника: " + person.fullName + ", зарплата: " + person.salary);
            }
        }
    }

    public void biggerLower(int certainSalary) {
        System.out.println("\nСотрудники с зарплатой больше (или равно) " + certainSalary + " рублей");
        for (EmployeeBook person : people) {
            if (person.salary >= certainSalary) {
                System.out.println("id: " + id() + ", ФИО работника: " + person.fullName + ", зарплата: " + person.salary);
            }
        }
        System.out.println("\nСотрудники с зарплатой меньше " + certainSalary + " рублей");
        for (EmployeeBook person : people) {
            if (person.salary < certainSalary) {
                System.out.println("id: " + id() + ", ФИО работника: " + person.fullName + ", зарплата: " + person.salary);
            }
        }
    }
}
