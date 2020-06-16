import java.util.Scanner;

public class Crypt {

  String outputstring = "";
  String input;
  Scanner readInput = new Scanner(System.in);
  char transformedchar;
  int key;

  /*Die @method crypt Verschluesselt einen String mit der Caesar Chiffre. Es werden keine parameter übergeben.
  Diese werden in der Methode selber abgefragt. Die Variablen
   */
  void crypt(char selectionchar) {
    System.out.println("Bitte Text angeben");
    input = readInput.nextLine(); //Nächste eingabe Lesen
    System.out.println("Nun bitte den Schluessel angeben");
    key = Integer.parseInt(readInput.nextLine()); //parse next string into int
    /*Die naechste Eingabe Lesen, sowie in ein int
    parsen umd Fehler zu vermeiden*/
    //System.out.println("For debugging"+input.length());
    for (int i = 0; i < input.length(); i++) //for schleife um den string zu verschluesseln.
    {
      if (ChiffrenUtility.isCharacter(input.charAt(i))) {

        switch (selectionchar) {
          case 'a':
            if (ChiffrenUtility.isCharacter(input.charAt(i) + key)) {
              transformedchar = (char) (input.charAt(i) + key);
            } else {
              transformedchar = (char) (input.charAt(i) + key - 26);
            }
            break;
          case 'b':
            if (ChiffrenUtility.isCharacter(input.charAt(i) - key)) {
              transformedchar = (char) (input.charAt(i) - key);
            } else {
              transformedchar = (char) (input.charAt(i) - key + 26);
            }
            break;

          default:
            break;
        }

      } else {
        transformedchar = (input.charAt(i));

      }

      //Es wird hier der finale String generiert. Fuer jeden durchlauf der for schleife, fuegen wir ein
      //weiteres verschluesseltes Zeichen ein. Dadurch wird der gesamte eingegebende String verschluesselt und ausgegeben.
      outputstring = outputstring.concat(String.valueOf(transformedchar));
    }
    System.out.println(outputstring); //printing out the encrypted string
    outputstring = ""; //empty string for the next loop
  }
}


