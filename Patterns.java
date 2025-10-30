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
    String placeholder = "";
    var row = 0;
    var amount = 0;
    while (row < rows) {
      placeholder = "";

      amount = 0;
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
    String placeholder = "";
    var row = 1;
    var amount = 0;
    while (row <= rows) {
      placeholder = "";

      amount = 0;
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
    String placeholder = "";
    for (int i = start; i > 0;) {
      placeholder = "";
      for (int j = 0; j < i; j++) placeholder += i;
      System.out.println(placeholder);
      i -= 2;
    }
  }
  
  //  Pre-condition: 
  //  Post-condition: 
  public static void eo(int maxE){
    char letter;
    String placeholder;
    
    for (var i = 0; i < maxE; i++) {
      if ((maxE + i) % 2 == 1) letter = 'E';
      else letter = 'O';

      placeholder = "";
      for (var j = 0; j <= i; j++) {
        placeholder += letter;
      }
      System.out.println(placeholder);
    }

    for (var i = maxE - 2; i >= 0; i--) {
      if ((maxE + i) % 2 == 1) letter = 'E';
      else letter = 'O';

      placeholder = "";
      for (var j = 0; j <= i; j++) {
        placeholder += letter;
      }
      System.out.println(placeholder);
    }
  }


  //  Pre-condition: 
  //  Post-condition: 
  public static void pyramid(int rows){
    String spaces = "";
    String letters = "";
    for (var i = 0; i < rows; i++) {
      for (var j = 0; j < (2 * rows - 1 - 2 * i); j++) letters = letters + (i + 1);

      System.out.println(spaces + letters + spaces);
      spaces += " ";
      letters = "";
    }
  }
}
