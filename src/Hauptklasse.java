/*Programm zur Chiffrierung und dechiffrierung von Texten mit der Caesar Chiffre
@author Emily Tobin 12.06.2020
 */

import java.util.Scanner;

public class Hauptklasse {

  public static void main(String[] args) {
    Crypt crypt1 = new Crypt();
    Scanner selection = new Scanner(System.in);
    while (true) {
      System.out.println("Chiffrieren: a\nDechiffrieren: b\nExit:e ");
      System.out.println("Waiting for input:");
      String selectionstring = selection.nextLine(); //String for selecting a mode
        /* Ein char kann nicht eingelesen werden. Deshalb nutzen wir die Funktion CharAt um aus dem
        eingelesenden String den ersten Character zu extrahieren. Damit wir ihn für unseren Switch
        Case nutzen können, schreiben wir ihn in die @var selectionchar
         */
      char selectionchar = selectionstring.toLowerCase().charAt(0);
      switch (selectionchar) {
        case 'a':
          System.out.println("Encrypt is selected");
          crypt1.crypt(selectionchar);
          break;
        case 'b':
          System.out.println("Decrypt is selected");
          crypt1.crypt(selectionchar);
          break;
        case 'e':
          System.exit(0);
        default:
          System.out.println("No selection has been made");
      }
    }
  }
}
