public class Main {
  public static void main(String[] args) {
    // 1
    hello();

    // 2 & 3
    int number = 6;
    positiveOrNegative(number);
    postiveOrZeroOrNegativ(number); // Dit is tevens ook Opdracht 4: Positief/Negatief/Zero Checker vanuit de bonus opdrachten IF ELSE

    // 4
    String name = "Henk";
    bartender(name);

    // 5
    int input1 = 4;
    int input2 = 20;
    sum(input1, input2);
  }

  public static void hello() {
    System.out.println("Hello");
  }

  public static void positiveOrNegative(int number) {

    if (number >= 0) {
      System.out.println("This number is positive!");
    } else {
      System.out.println("This number is - negative!");
    }
  }

  public static void postiveOrZeroOrNegativ(int number) {
    if (number > 0) {
      System.out.println("This number is positive!");
    } else if (number == 0) {
      System.out.println("This number is zero");
    } else {
      System.out.println("This number is negative!");
    }
  }

  public static void bartender(String drink) {
    switch (drink) {
      case "Henk":
        System.out.println("Here is the Cola for " + drink);
        break;
      case "Maarten":
        System.out.println("Here is the Fanta for " + drink);
        break;
      case "Hans":
        System.out.println("Here is the Vodka for " + drink);
        break;
      default:
        System.out.println("The bartender did not whos drink it is");
        break;
    }
  }

  public static void sum(int input1, int input2) {
    int sum = input1 + input2;
    System.out.println("The sum is: " + sum);
  }
}