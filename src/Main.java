public class Main {
  public static void main(String[] args) {
    hello();
    int number = 0;
    positiveOrNegative(number);
    postiveOrZeroOrNegativ(number);

    String name = "7up";
    bartender(name);

    int input1 = 20;
    int input2 = 3;
    sum(input1, input2);


    //bonus
    int numberCheckOddEven = 3;
    evenOddChecker(numberCheckOddEven);

    int gradeNumber = 3;
    String numverConverted = gradeConverter(gradeNumber);
    System.out.println("The converted grade you got is: " + numverConverted);


    double biggestOrNot1 = 5;
    double biggestOrNot2 = 8;
    double biggestOrNotResult = checkBiggestNumber(biggestOrNot1, biggestOrNot2);
    System.out.println(biggestOrNotResult);

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
    }
    else {
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


  //bonus opdrachten
  public static void evenOddChecker(int number) {
    if(number % 2 == 0) {
      System.out.println("Het getal is even");
    } else {
      System.out.println("Het getal is oneven");
    }
  }


  // Kan dit ook in een switch case, weet niet helemaal of ik vergelijkings operatoren kan gebruiken
  public static String gradeConverter(double grade) {
    if(grade >= 1 && grade < 3) {
      return "F";
    } else if(grade >= 3 && grade < 4) {
      return "D";
    } else if(grade >= 4 && grade < 5) {
      return "C";
    } else if (grade >= 5 && grade < 6) {
      return "B";
    } else if(grade >= 6 && grade < 19) {
      return "A";
    } else{
      return "Wrong number";
    }
  }

  public static double checkBiggestNumber(double number1, double number2) {
    if(number1 > number2) {
      return number1;
    } else {
      return number2;
    }
  }

}