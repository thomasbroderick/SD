import java.util.Scanner;

public class ThreeVariables {
  public static void main(String[] args) {
    String deptCode;
    double salary;
    int employeeID;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the dept code: ");
    deptCode = keyboard.next();

    System.out.print("Enter the salary: ");
    salary = keyboard.nextDouble();

    System.out.print("Enter an employeeID: ");
    employeeID = keyboard.nextInt();

    System.out.println(deptCode + " " + salary + " " + employeeID);

    System.out.println(deptCode + "\t" + salary + "\t" + employeeID);

    System.out.println(deptCode + "\n" + salary + "\n" + employeeID);

    keyboard.close();

  }
}
