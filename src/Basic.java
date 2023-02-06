public class Basic {
    public static void main(String[] args) {
        // Хранилище было в создано в классе Employee для удобства, чтобы не путаться
        //basic
        printAll();
        monthlyExpenses();
        minSalary();
        maxSalary();
        middleSalary();
        printTheFullNameOfEveryEmployee();
    }

    public static void printAll() {
        System.out.println("Список всех сотрудников со всеми данными");
        Employee[] people = Employee.getPeople();
        for (Employee person : people) {
            System.out.println("id: " + person.getId() + ", " + person);
        }
    }

    public static void monthlyExpenses() {
        Employee[] people = Employee.getPeople();
        float monthlyExpenses = 0;
        for (Employee person : people) {
            monthlyExpenses += person.getSalary();
        }
        System.out.println("\nСумма затрат на зарплаты за месяц составляет " + monthlyExpenses + " рублей");
    }

    public static void minSalary() {
        Employee[] people = Employee.getPeople();
        float minSalary = Integer.MAX_VALUE;
        int minSalaryEmployee = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSalary() < minSalary) {
                minSalaryEmployee = i;
                minSalary = people[i].getSalary();
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой: " + people[minSalaryEmployee]);
    }

    public static void maxSalary() {
        Employee[] people = Employee.getPeople();
        float maxSalary = Integer.MIN_VALUE;
        int maxSalaryEmployee = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSalary() > maxSalary) {
                maxSalaryEmployee = i;
                maxSalary = people[i].getSalary();
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой: " + people[maxSalaryEmployee]);
    }

    public static void middleSalary() {
        Employee[] people = Employee.getPeople();
        float monthlyExpenses = 0;
        for (Employee person : people) {
            monthlyExpenses += person.getSalary();
        }
        System.out.println("\nСреднее значение зарплат равняется " + monthlyExpenses/people.length + " рублям в месяц");
    }

    public static void printTheFullNameOfEveryEmployee() {
        Employee[] people = Employee.getPeople();
        System.out.println("\nСписок ФИО всех сотрудников");
        for (Employee person : people) {
            System.out.println("ФИО работника: " + person.getFullName());
        }
    }
}
