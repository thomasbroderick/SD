import java.util.Scanner;

public class FiveIntegers {
  public static void main(String[] args) {
    int num1, num2, num3, num4, num5;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    num1 = keyboard.nextInt();

    System.out.print("Enter an integer: ");
    num2 = keyboard.nextInt();

    System.out.print("Enter an integer: ");
    num3 = keyboard.nextInt();

    System.out.print("Enter an integer: ");
    num4 = keyboard.nextInt();

    System.out.print("Enter an integer: ");
    num5 = keyboard.nextInt();

    System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);

    System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5);

    System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5);

    keyboard.close();

  }
}
