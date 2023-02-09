package Upper_Intermediate;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

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

    private static final EmployeeBook[] people = new EmployeeBook[10];

    static {
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

    public static void main(String[] args) {
        printAllSortedByDivisions();
    }

    public static class EmployeeDivisionSort implements Comparator<EmployeeBook> {
        @Override
        public int compare(EmployeeBook o1, EmployeeBook o2) {
            return o1.division - o2.division;
        }
    }


    public static void printAllSortedByDivisions() {
        Arrays.sort(people, new EmployeeDivisionSort());
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (counter != people[i].division) {
                System.out.println("\nСотрудники " + people[i].division + " отдела");
            }
            System.out.println(people[i].fullName);
            counter = people[i].division;
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
}
