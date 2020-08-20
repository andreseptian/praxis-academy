public class Employee1 {

    // salary variable is a private static variable
    private static int salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Dev ";

    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}