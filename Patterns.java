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

  //  Pre-condition: 
  //  Post-condition: 
  public static void stars(int rows){
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

  //  Pre-condition: 
  //  Post-condition: 
  public static void triangle(int rows){
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

  //  Pre-condition: 
  //  Post-condition: 
  public static void odds(int start){
    for (int i = start; i > 0;) {
      String placeholder = "";
      for (int j = 0; j < i; j++) placeholder += i;
      System.out.println(placeholder);
      i -= 2;
    }
  }
  
  //  Pre-condition: 
  //  Post-condition: 
  public static void eo(int maxE){
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
