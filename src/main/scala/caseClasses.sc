case class Money(d: Int, c: Int) {

  def +(that: Money) = Money(toFloat + that.toFloat)
  def -(that: Money) = Money(toFloat - that.toFloat)
  def ==(that: Money) = toFloat==that.toFloat
  def <(that: Money) = toFloat<that.toFloat
  def toFloat = (d+"."+c).toFloat
  def Money(d: Float) = {
    val s = d.toString.split('.')
  new Money(s(0).toInt, s(1).toInt)
  }



}

//object Money{
//  def apply(d: Int, c: Int): Money = new Money(d, c)
//  def apply(d: Float): Money = {
//    val s = d.toString.split('.')
//    new Money(s(0).toInt, s(1).toInt)
//  }
//}
//
(Money(1, 75) + Money(0, 50) == Money(2, 25) )
