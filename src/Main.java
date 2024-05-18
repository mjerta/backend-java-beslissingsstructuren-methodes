public class Main {
  public static void main(String[] args) {
    // 1
    hello();


    // 2 & 3
    int number = 0;
    positiveOrNegative(number);
    postiveOrZeroOrNegativ(number); // Dit is tevens ook Opdracht 4: Positief/Negatief/Zero Checker vanuit de bonus opdrachten IF ELSE

    // 4
    String name = "7up";
    bartender(name);

    // 5
    int input1 = 20;
    int input2 = 3;
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
      case "cola":
        System.out.println("Here is the " + drink);
        break;
      case "7up":
        System.out.println("Here is the " + drink);
        break;
      case "fanta":
        System.out.println("Here is the " + drink);
        break;
      default:
        System.out.println("The bartender did not know what to give you");
        break;
    }
  }

  public static void sum(int input1, int input2) {
    int sum = input1 + input2;
    System.out.println("The sum is: " + sum);
  }
}