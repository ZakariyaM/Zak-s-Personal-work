
abstract class UnitConversion {
  def convert(value:Double):Double
}

object InchesToCentimeters extends UnitConversion {
  def convert(value:Double) = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  def convert(value:Double) = value * 3.78541
}

object MilesToKilometres extends UnitConversion {
  def convert(value:Double) = value * 1.60934
}

class Point (val x: Double, val y :Double)

object Point {
  def apply (x:Double,y:Double) = new Point(x,y)
  val p = Point (4,3)
  assert(p.x == 3.0)
}





object HelloWorld extends App {
  "Hello World".split(" ").reverse.map(w => print(w))
}







