public class Employee {
    private String fullName;
    private int division;
    private float salary;
    private static int id() {
        id++;
        return id;
    }
    private static int id;
    public Employee(String fullName, int division, float salary) {
        this.fullName = fullName;
        this.division = division;
        this.salary = salary;
    }
    public int getId() { return id = id(); }
    public String getFullName() { return this.fullName; }
    public int getDivision() { return this.division; }
    public float getSalary() { return this.salary; }
    public void setDivision(int division) { this.division = division; }
    public void setSalary(float salary) { this.salary = salary; }
    public static Employee[] people = new Employee[10];
    static  {
        Employee person1 = new Employee("Петров Петр Петрович", 2, 25_000);
        Employee person2 = new Employee("Павлов Павел Павлович", 3, 35_000);
        Employee person3 = new Employee("Алексеев Алексей Алексеевич", 4, 22_000);
        Employee person4 = new Employee("Николаев Николай Николаевич", 1, 39_000);
        Employee person5 = new Employee("Александров Александр Александрович", 5, 31_000);
        Employee person6 = new Employee("Павлов Павел Павлович", 3, 28_000);
        Employee person7 = new Employee("Алексеев Алексей Алексеевич", 3, 32_000);
        Employee person8 = new Employee("Николаев Николай Николаевич", 2, 32_000);
        Employee person9 = new Employee("Александров Александр Александрович", 1, 19_000);
        Employee person10 = new Employee("Павлов Павел Павлович", 2, 28_000);

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
    public static Employee[] getPeople() {
        return people;
    }
    @Override
    public String toString() {
        return "ФИО работника: " + fullName + ", отдел: " + division + ", зарплата: " + salary;
    }
}

