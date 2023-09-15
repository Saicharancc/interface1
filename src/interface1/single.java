package interface1;

class Employee {
    void salary() {
        System.out.println("Salary= 300000");
    }
}

class Programmer extends Employee { 
// Programmer class inherits from Employee class
    void bonus() {
        System.out.println("Bonus=100000");
    }
}

public class single {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
    }
}
