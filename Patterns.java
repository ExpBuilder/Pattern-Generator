//
//  Class author: Joe Jiao
//  Date created: 10/29/2025
//  General description: This class containts and tests various methods to create patterns based on inputs.
//
public class Patterns {
  public static void main(String[] args){
    stars(7);
    System.out.println("");
    triangle(9);
    System.out.println("");
    odds (9);
    System.out.println("");
    eo (6);
    System.out.println("");
    pyramid (5);
  }

  //  Pre-condition: Input rows must be a positive integer
  /*  Post-condition: A right triangle or 'pyramid' with the vertical leg aligned to the left and horizontal leg aligned to the bottom formed out of asterisks (*) is printed.

  The pyramid is composed of layers increasing in size as one goes down the pyramid, with each layer being two astericks thicker than the previous. 
  The first layer is formed of a single asterisk.
  */
  public static void stars(int rows){
    if (rows < 1) return;

    int row = 0;
    while (row < rows) {
      String placeholder = "";
      
      int amount = 0;
      while (amount < (1 + 2 * row)) {
        placeholder += "*";
        amount++;
      }
      System.out.println(placeholder);
      row++;
    }
  }

  //  Pre-condition: Input rows must be a positive integer less than ten
  /*  Post-condition:  A right triangle or 'pyramid' with the vertical leg aligned to the left and horizontal leg aligned to the bottom formed out of numbers is printed.

  The numbers in each row correspond with their respective row number. For example, row 1 is made of 1s, row 2 is made of 2s, etc.
  The length of each row is their respective row number. For example, row 1 is length 1.
  */
  public static void triangle(int rows){
    if (rows >= 10 || rows < 1) return;

    int row = 1;
    while (row <= rows) {
      String placeholder = "";

      int amount = 0;
      while (amount < row) {
        placeholder += row;
        amount++;
      }

      System.out.println(placeholder);
      row++;
    }
  }

  //  Pre-condition: Input start must be an odd integer between 1 and 9, inclusive.
  /*  Post-condition:  A right triangle or 'pyramid' with the vertical leg aligned to the left and horizontal leg aligned to the top formed out of numbers is printed.
  The numbers each row is composed of is the length of each row
  The first row is of length input start. Each following row is two characters shorter.
  */
  public static void odds(int start){
    if (start % 2 == 0 || start >= 10 || start < 1) return;

    for (int i = start; i > 0;) {
      String placeholder = "";
      for (int j = 0; j < i; j++) placeholder += i;
      System.out.println(placeholder);
      i -= 2;
    }
  }
  
  //  Pre-condition: Input maxE must be a positive integer.
  /*  Post-condition:  An isosceles triangle with the base aligned to the left that is formed of alternating rows of Es or rows of Os is printed.
  The triangle will begin and end with rows of length 1. Each row will increase/decrease by length 1 until the middle/end is reached, respectively.
  The longest row, row number maxE, will be composed of only Es. There will only be one longest row.
  */
  public static void eo(int maxE){
    if (maxE < 1) return;

    for (int i = 0; i < maxE; i++) {
      char letter = 'O';
      if ((maxE + i) % 2 == 1) letter = 'E';

      String placeholder = "";
      for (int j = 0; j <= i; j++) placeholder += letter;
      System.out.println(placeholder);
    }

    for (int i = maxE - 2; i >= 0; i--) {
      char letter = 'O';
      if ((maxE + i) % 2 == 1) letter = 'E';

      String placeholder = "";
      for (int j = 0; j <= i; j++) placeholder += letter;
      System.out.println(placeholder);
    }
  }

  //  Pre-condition: Input rows must be an integer between 1 and 9 inclusive
  /*  Post-condition: An isosceles triangle with the base aligned to the top formed out of numbers that are the number of their respective row are printed.
  The first row will be of length rows and will be formed out of 1s, the second will be formed out of 2s, etc.
  Each subsequent row will be two shorter than the preceding
  */
  public static void pyramid(int rows){
    if (rows < 1 || rows > 9) return;
    
    String spaces = "";
    for (int i = 1; i <= rows; i++) {
      String letters = "";
      for (int j = 0; j < (2 * rows + 1 - 2 * i); j++) letters += i;

      System.out.println(spaces + letters + spaces);
      spaces += " ";
    }
  }
}
