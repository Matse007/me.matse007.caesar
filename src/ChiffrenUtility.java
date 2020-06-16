/**
 * Utilities used for caesar encryption programs
 **/
public class ChiffrenUtility {

  /**
   * Method for checking if you are within a certain range of the ASCII table. Currently used to
   * check if its either a lower or upper case letter
   */
  static boolean isCharacter(int toTest) {
    if (toTest < 91 && toTest > 64 || toTest < 123 && toTest > 96) {
      return true;
    } else {
      return false;
    }
  }
}