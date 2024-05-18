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
    int[] numbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
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
    String[] arrayWords = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
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
    int[] numbersForCheckAbove = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
    printNumbersAbove(numbersForCheckAbove, 45);
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
      // Als deze getal een natuurlijk geal overhoud en door 2 getallen kan delen is dit een priem getal.

      // als referentie moest ik het even opzoeken:
      //  Eigenlijk is de definitie van een priemgetal heel simpel: het is een natuurlijk getal die je door precies twee getallen kan delen, waardoor je met die deling een natuurlijk getal overhoudt.
      int num = x;
      int count = 0;
      for (int i = 1; i <= num; i++) {
        //dus je kan met een module checken hoevaak je voor een specifiek getal het aantal natuurlijke resultaten dat je overhoud
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

}
