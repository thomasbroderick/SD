public class LetterHouse {
  public static void main(String[] args) {
    printRoof();
    printFloor();
  }

  public static void printRoof() {
    System.out.println("                  BBBB");
    System.out.println("        RRRRRRRR  B  B");
    System.out.println("      R          RB  B");
    System.out.println("   R               RB");
    System.out.println("  R                   R");
    System.out.println("R                       R");
  }

  public static void printFloor() {
    System.out.println(" T  TTTT         TTTT  T");
    System.out.println(" T  T  T  BBBBB  T  T  T");
    System.out.println(" T  TTTT  B   B  TTTT  T");
    System.out.println(" T        B  BB        T");
    System.out.println(" T        B   B        B");
    System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT");
  }
}
