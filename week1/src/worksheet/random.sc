def random() =
  scala.util.Random.nextInt(100)

def selfDivideValue(x: Int):Double = x / x

def selfDivideName(x: => Int):Double = x / x

selfDivideValue(random())
selfDivideValue(random())
selfDivideValue(random())
selfDivideValue(random())
selfDivideValue(random())
selfDivideValue(random())
selfDivideValue(random())
selfDivideValue(random())

selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())
selfDivideName(random())



