/**
* Class SequenceMatcher - A simplified implimetation of Python's SequenceMatcher
*                         Currently only supports strings and ratio()
* @version 0.1
* @param stringA - first string
* @param stringB - second string
*/
class SequenceMatcher(stringA: String, stringB: String) {
  /**
  * ratio()
  * @return Return a measure of the sequences’ similarity as a float in the range [0, 1]
  */
  def ratio(): Double = {
    (2.0 * numOfMatches()) / (stringA.length() + stringB.length())
  }
  /**
  * numOfMatches()
  * @return number of characters that match in the two strings
  */
  def numOfMatches(): Long = {
    stringA.intersect(stringB).length()
  }
}
