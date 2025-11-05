//
//  Class author: Joe Jiao
//  Date created: 10/29/2025
//  General description: 
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
  /*  Post-condition: A right triangle or 'pyramid' with the vertical leg aligned to the left and horizontal leg aligned to the bottom is formed out of asterisks (*)

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
  /*  Post-condition:  A right triangle or 'pyramid' with the vertical leg aligned to the left and horizontal leg aligned to the bottom is formed out of numbers.

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
  /*Post-condition: 

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
  //  Post-condition: 
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

  //  Pre-condition: 
  //  Post-condition: 
  public static void pyramid(int rows){
    String spaces = "";
    for (int i = 1; i <= rows; i++) {
      String letters = "";
      for (int j = 0; j < (2 * rows + 1 - 2 * i); j++) letters += i;

      System.out.println(spaces + letters + spaces);
      spaces += " ";
    }
  }
}
