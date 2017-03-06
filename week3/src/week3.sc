abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class NonEmpty(x: Int, left: IntSet, right : IntSet) extends IntSet  {
  def incl(x: Int) = left
  def contains(x : Int) = true
  def union(other: IntSet) = ((left union right) union other) incl x
}

if(true) 1 else false

if(true) 1 else ""
