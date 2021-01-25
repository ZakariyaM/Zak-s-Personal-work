
import java.util
import scala.math
//Using a Stack to check for parentheses This works by passing in a string which is converted to a CharArray
//then to a list. And it checks to see if there is an equal amount of opening and closing
//parentheses and using a stack allows me to check the stack to see if it contains the parentheses

def balance(chars: List[Char]): Boolean = {
  val s = new util.Stack[Char]
  for (i <- chars) {
    if (i == '(')
      s.push(i)
    if (i == ')') {
      if (s.isEmpty())  return false
      else s.pop()
    }
  }
  if (s.isEmpty) true
  else false
}

balance("Zak())".toCharArray.toList) // false

//Searching is done much more easily without the need of complex
//algorithms as libraries allow efficient searching and sorting to be conducted effectively
//Searching
val a = Array(1,4,2,5,7,9,53,23)
a.contains(23)
val s = List("skl,sk,kl")
s.contains("sl")




//Sorting done allowing you to sort with the library Sorted and in any order
//or style the user wants to be sorted.
a.sorted
a.sortWith(_>_)
//Many more sorting libraries like sortBy, sortInPlace and more etc

