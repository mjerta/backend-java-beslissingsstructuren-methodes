

package BONUS;

public class Loops {
  public static void main(String[] args) {

    // 1.
    System.out.println("Opdracht 1");
    System.out.println(sumToHundredForLoop());
    //of
    System.out.println(sumToHundredWhileLoop());
    System.out.println();

    // 2.
    System.out.println("Opdracht 2");
    calculateToTHousand();
    System.out.println();

    // 3
    System.out.println("Opdracht 3");
    int[] numbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38,
        70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8,
        31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43,
        41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37,
        13, 54, 19, 71, 42, 44, 90, 52, 51};
    int whatNumber = 45;
    boolean foundNumber = searchForNunmberInArray(numbers, whatNumber);
    if (foundNumber) {
      System.out.println("Found number");
    } else {
      System.out.println("Not found the number");
    }
    System.out.println();

    // 4
    System.out.println("Opdracht 4");
    int[] numbersForSum = {12, 5, 7, 2, 18, 3, 9, 12};
    int sumOfNumbers = sumNumbersOfArray(numbersForSum);
    System.out.println("Het resultaat is " + sumOfNumbers);
    System.out.println();

    // 5
    System.out.println("Opdracht 5");
    String[] arrayWords = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren"
        , "", "Deze", "student", "haalde", "goede", "cijfers"};
    lookForEmptyStringFor(arrayWords);
    // of
    lookForEmptyStringWhile(arrayWords);
    System.out.println();

    // 6
    System.out.println("Opdracht 6");
    printOutPrimeNumbers();
    System.out.println();

    // 7
    System.out.println("Opdracht 7");
    int[] numbersForCheckAbove = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33,
        83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2,
        26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56,
        49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48,
        62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
    printNumbersAbove(numbersForCheckAbove, 45);
    System.out.println();

    // 8
    System.out.println("Opdracht 8");
    countDown();
    System.out.println();

    // 9
    System.out.println("Opdracht 9");
    generateFibonaci(10);
    System.out.println();

    // 10
    System.out.println("Opdracht 10");
    createTriangle(41);
    System.out.println();
  }

  public static int sumToHundredForLoop() {
    int result = 0;
    for (int i = 2; i < 100; i += 2) {
      result += i;
    }
    return result;
  }

  public static int sumToHundredWhileLoop() {
    int result2 = 0;
    int i = 0;
    while (i < 100) {
      result2 += i;
      i += 2;
    }
    return result2;
  }

  public static void calculateToTHousand() {
    int number = 1;
    while (number < 1000) {
      System.out.println(number);
      number = number * 2;
    }
  }

  public static boolean searchForNunmberInArray(int[] numbers, int whatNumber) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == whatNumber) {
        return true;
      }
    }
    return false;
  }

  public static int sumNumbersOfArray(int[] numbers) {
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    return result;
  }

  public static void lookForEmptyStringFor(String[] arrayWords) {
    for (String word : arrayWords) {
      System.out.println(word);
      // equals is een methode die vanuit de String gebruikt kan worden. Ik kende deze nog niet.
      // Voorheen gebruikte ik == "" for example
      if (word.equals("")) {
        return;
      }
    }
  }

  public static void lookForEmptyStringWhile(String[] arrayWords) {
    int i = 0;
    while (i < arrayWords.length) {
      if (arrayWords[i].equals("")) {
        break;
      }
      System.out.println(arrayWords[i]);
      i++;

    }
  }

  public static void printOutPrimeNumbers() {
    for (int x = 0; x <= 100; x++) {
      // onderstaand laat zien hoe je voor een nummer de priem getal kan opzoeken.
      // Als deze getal een natuurlijk geal overhoud en door 2 getallen kan delen is dit een
      // priem getal.

      // als referentie moest ik het even opzoeken:
      //  Eigenlijk is de definitie van een priemgetal heel simpel: het is een natuurlijk getal
      //  die je door precies twee getallen kan delen, waardoor je met die deling een natuurlijk
      //  getal overhoudt.
      int num = x;
      int count = 0;
      for (int i = 1; i <= num; i++) {
        //dus je kan met een module checken hoevaak je voor een specifiek getal het aantal
        // natuurlijke resultaten dat je overhoud
        if (num % i == 0) {
          count++;
        }
      }

      // Hier wordt uiteindelijk het priem nummer uitgeprint.
      if (count == 2) {
        System.out.println(num);
      }
    }
  }

  public static void printNumbersAbove(int[] numbersForCheckAbove, int whatNumber) {
    for (int number : numbersForCheckAbove) {
      if (number > whatNumber) {
        System.out.println(number);
      }
    }
  }

  public static void countDown() {
    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }
  }

  public static void generateFibonaci(int amount) {
    int start = 0;
    // numbers i need for my Fibonacci sequence
    int fibonaciNumber;
    int firstNumber = 0;
    int secondNumber = 1;
    System.out.println("Default");
    System.out.println(firstNumber);
    System.out.println(secondNumber);
    while (start < amount) {
      start++;
      fibonaciNumber = firstNumber + secondNumber;
      System.out.println(fibonaciNumber + " = " + firstNumber + " +  " + secondNumber);
      firstNumber = secondNumber;
      secondNumber = fibonaciNumber;
    }
  }

  public static void createTriangle(int howBig) {
    // the number below is needed to measure based on how many rows the spaces will be on one line
    // Normally for a triangle with 10 rows 4 spaces are needed. So 10 could be devided by 2 to
    // get 5. When the loops goes in the devider will decrement with one so it will starts with
    // the number 4.
    // The (howbig + 1) is being devided by 2 when you are dealing with uneven numbers so
    // everytime you end up with the correct number of spaces.

    int spaces = (howBig + 1) / 2;

    for (int i = 1; i <= howBig; i += 2) {

      // this variable is needed and everytime the main loop is starting the number will be less
      // each time

      // int test = (4 - i / 2); this was the number I tried first but its confusing me a bit
      spaces--;
      // loop for spaces
      // for every row there will be a certain ammount of spaces needed
      for (int k = 0; k < spaces; k++) {
        System.out.print(" ");
      }

      // this will print out a certain amount of * on a row.
      // Because the iterator i is being incremented with 2 every loop the number of times this
      // loop willl continue is being added every time with 2 as well. Thus makeing it a triangle
      // shape
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      // this prints out new line (new row)
      System.out.println("");
    }
  }

}
