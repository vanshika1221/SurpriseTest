import scala.jdk.Accumulator

//Find a specific character in a string and replace it with another character
object SurpriseTestGroupA extends App {
  def stringReplace(userInput: String, toBeReplaced: Char, replaceWith: Char, index: Int = 0): String = {
    if (index == userInput.length - 1) {
      return userInput
    }
    else if (userInput.charAt(index) == toBeReplaced) {
       userInput.charAt(index) = replaceWith
    }
      stringReplace(userInput, toBeReplaced, replaceWith, index + 1)
  }

  println(stringReplace("vanshika", 'a', 'y'))
}
