var sign = 0
var ch: Char = '_'

ch match {
  case '+' => sign = 1
  case '-' => sign = -1
  case _ => sign = 0
}



sign = ch match{
  case '+' => 1
  case '-'=> -1
  case _ => 0
}
print(ch, sign)


var obj =

obj match{
  case x : Int => x
  case s : String => Integer.parseInt(s)
  case _ : BigInt => Int.MaxValue
  case _  =>0
}

var arr = Array(0,1,2,3,4,5,6,7)

arr match {
  case Array(0) => "0"
  case Array(x, y) => s"$x,$y"
  case Array(x, rest@_*) => rest.min
  case _ => "something else"
}


sealed abstract class TrafficLightColor
case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object Green extends TrafficLightColor


//
//def swap(p: (Int,Int)): (Int, Int) = p match {case (x, y) => (y, x)}
//
//swap(6,5)
def swap(a: Array[Int]) = a match { case Array(a, b, end @ _*) => Array(b, a) ++ end }
swap(Array(1))
