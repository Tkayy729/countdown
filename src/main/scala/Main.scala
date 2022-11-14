import scala.collection.mutable
import scala.util.Random
import scala.io.StdIn._
object Main {
  def main(args: Array[String]): Unit = {
    val playerList = mutable.Stack[String]()
    val vowels = mutable.Stack[String]("A", "E", "I", "O", "U");
    val consonants = mutable.Stack[String]("B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q",
      "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    println("GAME")
    println("Enter your username: ")
    val name = readLine()
    println(s"Welcome $name, THIS THE COUNTDOWN GAME")
    var score = 0
    println("ROUND ONE: Letter Round\n Choose 9 letters. At least three vowels and at least four consonants\n")
    shuffleStackConsonants(consonants)
    shuffleStackVowel(vowels)

       var i = 0
      while (i < n) {
        removeAndAddLetterToPlayerList(vowels,playerList)
        removeAndAddLetterToPlayerList(consonants,playerList)
      }

    println("Enter the number of vowels you want to choose: ")
    val numberOfVowels = readInt();
    println("Enter the number of consonants you want to choose: ")
    val numberOfConsonants = readInt();

    println(s"$name , you chose $numberOfVowels vowels and $numberOfConsonants consonants")


  }



  def shuffleStackVowel(vowels : mutable.Stack[String]) : mutable.Stack[String]= {
    Random.shuffle(vowels)
  }

  def shuffleStackConsonants(consonants : mutable.Stack[String]): mutable.Stack[String] = {
    Random.shuffle(consonants)
  }


  def removeAndAddLetterToPlayerList(stack  : mutable.Stack[String],playerList : mutable.Stack[String] ): Unit ={
     val removedLetter = stack.pop()
     playerList.addOne(removedLetter)
  }

  def numberoftimes (n: Int): Unit ={
    while(i < n ){
      removeAndAddLetterToPlayerList()
    }
  }



}