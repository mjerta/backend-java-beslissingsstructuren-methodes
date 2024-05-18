public class Main {
  public static void main(String[] args) {
    hello();
    int number = 0;
    positiveOrNegative(number);
    postiveOrZeroOrNegativ(number); // Dit is tevens ook Opdracht 4: Positief/Negatief/Zero Checker vanuit de bonus opdrachten IF ELSE

    String name = "7up";
    bartender(name);

    int input1 = 20;
    int input2 = 3;
    sum(input1, input2);

    // bonus assignments - IF ELSE

    // Opdracht 1: Even/Odd Checker
    int numberCheckOddEven = 3;
    evenOddChecker(numberCheckOddEven);

    // Opdracht 2: Grader
    int gradeNumber = 3;
    String numverConverted = gradeConverter(gradeNumber);
    System.out.println("The converted grade you got is: " + numverConverted);

    // Opdracht 3: Grootste van Twee Getallen
    double biggestOrNot1 = 5;
    double biggestOrNot2 = 8;
    double biggestOrNotResult = checkBiggestNumber(biggestOrNot1, biggestOrNot2);
    System.out.println(biggestOrNotResult);

    //Opdracht 4: Positief/Negatief/Zero Checker
    // Deze opdracht is al gemaakt zie  postiveOrZeroOrNegativ()

    // Opdracht 5: Leeftijdsclassificatie
    String checkAgeClassification = ageClassification(17);
    System.out.println(checkAgeClassification);

    // Opdracht 6: Tekstlengte Checker
    String exampleString = "lorem asdaqsdas";
    String checkStringLength = stringClassification(exampleString);
    System.out.println("De lengte van de string is " + checkStringLength);

    // Opdracht 7: Jaar Checker
    boolean leapyear = isLeapYear(2196);
    if (leapyear) {
      System.out.println("It is a leapyear");
    } else {
      System.out.println("It is not a leapyear");
    }

    // Opdracht 8: Grootste van Drie Getallen
    double biggestNumber = biggestOfThree(70, 70, 70);
    System.out.println(biggestNumber);

    // Opdracht 9: Driehoekstype
    String checkTriangle = propertyOfTriangle(10, 10, 15);
    System.out.println("De driehoek is " + checkTriangle);

    // Opdracht 10: Calculator
    calculator(2, "*", 3);
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

  // bonus assignments - IF ELSE
  
  public static void evenOddChecker(int number) {
    if (number % 2 == 0) {
      System.out.println("Het getal is even");
    } else {
      System.out.println("Het getal is oneven");
    }
  }

  // Kan dit ook in een switch case, weet niet helemaal of ik vergelijkings operatoren kan gebruiken
  public static String gradeConverter(double grade) {
    if (grade >= 1 && grade < 3) {
      return "F";
    } else if (grade >= 3 && grade < 4) {
      return "D";
    } else if (grade >= 4 && grade < 5) {
      return "C";
    } else if (grade >= 5 && grade < 6) {
      return "B";
    } else if (grade >= 6 && grade < 19) {
      return "A";
    } else {
      return "Wrong number";
    }
  }

  public static double checkBiggestNumber(double number1, double number2) {
    if (number1 > number2) {
      return number1;
    } else {
      return number2;
    }
  }

  public static String ageClassification(int age) {
    if (age < 12) {
      return "kind";
    } else if (age >= 12 && age < 18) {
      return "puber";
    } else {
      return "volwassene";
    }
  }

  public static String stringClassification(String input) {
    int strLength = input.length();
    if (strLength < 10) {
      return "kort";
    } else if (strLength >= 10 && strLength <= 20) {
      return "middellang";
    } else {
      return "lang";
    }
  }

  public static boolean isLeapYear(int year) {
    if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
      return false;
    } else {
      return true;
    }
  }

  public static double biggestOfThree(double number1, double number2, double number3) {
    if (number1 >= number2 && number1 >= number3) {
      System.out.println("nr1");
      return number1;
    } else if (number2 >= number1 && number2 >= number3) {
      System.out.println("nr2");
      return number2;
    } else {
      System.out.println("nr3");
      return number3;
    }
  }

  public static String propertyOfTriangle(int side1, int side2, int side3) {
    if (side1 == side2 && side1 == side3) {
      return "gelijkzijdig";
    } else if (side1 == side2 || side1 == side3 || side2 == side3) {
      return "gelijkbenig";
    } else {
      return "ongelijkzijdig";
    }
  }

  public static void calculator(double number1, String operator, double number2) {
    double result;
    if (operator == "+") {
      result = number1 + number2;
      System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    } else if (operator == "-") {
      result = number1 - number2;
      System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    } else if (operator == "*") {
      result = number1 * number2;
      System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    } else if (operator == "/") {
      result = number1 / number2;
      System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    } else {
      System.out.println("The operator is not being found");
    }
  }

}