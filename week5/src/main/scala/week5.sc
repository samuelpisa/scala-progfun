def palindrome[T](x: T): Boolean = {
  def checkReverse[T](c: {def reverse:T}): Boolean = c == c.reverse

  x match {
    case Nil => false
    case y: String => y.length > 1 && checkReverse(y.replaceAll(" ", "").toLowerCase)
    case y: List[T] => checkReverse(y)
    case y: Number => checkReverse(y.toString)
    case _ => false
  }
}

palindrome("RACECAR")
palindrome(null)
palindrome(Nil)
palindrome(123)
palindrome(List(1,2,1,2,1))
palindrome(List("a","b","a"))
palindrome(121)
palindrome(2002)
palindrome("a")
palindrome("ab")
palindrome("aa")
palindrome("Able was I ere I saw Elba")
