/** Implement the function that checks whether a string is a valid identifier.
 *A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
 *digits and underscores.
 */


fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun isValidIdentifier(s: String): Boolean {
    //check if it's a non-empty string that starts with a letter
    if (s.isNullOrEmpty() || s.first().isDigit()) return false

    //Method to check if its a valid character
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()

    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}
