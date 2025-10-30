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
    odds (8);
    System.out.println("");
  }

  //  Pre-condition: what must be true prior to the method being called including possible limitations on input
  //  Post-condition: what the result of executing this method will be.
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

  //  Pre-condition: what must be true prior to the method being called including possible limitations on input
  //  Post-condition: what the result of executing this method will be.
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

  //  Pre-condition: what must be true prior to the method being called including possible limitations on input
  //  Post-condition: what the result of executing this method will be.
  public static void odds(int start){
    String placeholder = "";
    for (int i = start; i > 0;) {
      placeholder = "";
      for (int j = 0; j < i; j++) placeholder += i;
      System.out.println(placeholder);
      i -= 2;
    }
  }
  
  //  Pre-condition: what must be true prior to the method being called including possible limitations on input
  //  Post-condition: what the result of executing this method will be.
  public static void eo(int maxE){
    char startLetter;
    if (maxE % 2 == 1) {
      startLetter = 'E';
    } else startLetter = 'O';
    
    for (var i = 0; i < maxE; i++) {}

  }


  //  Pre-condition: what must be true prior to the method being called including possible limitations on input
  //  Post-condition: what the result of executing this method will be.
  public static void pyramid(int rows){
    
  }
}
