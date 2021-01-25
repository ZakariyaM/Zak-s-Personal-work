//val scores = Map("Alice"-> 10, "Bob"->3, "Cindy"->8)
import java.util.Scanner
val scores = scala.collection.mutable.Map("Alice"-> 10, "Bob"->3, "Cindy"->8)
//val scores = scala.collection.mutable.Map[String,Int]()

val AliceScore = if (scores.contains("Alice")) scores("Alice") else 0

val AliceScore = scores.getOrElse("Alice",0)

scores("Alice") = 2
scores+=("Fred" -> 2 , "Adam" -> 6 )
val Nscores = scores +("FREDINOOOOO" ->2)

val t = (1, 3.14 , "Fred")
val s = (t._1,t._2,t._3)


"Zak Mohamed".partition(_.isUpper)

val q = Array(1,2,3)
val o = Array(",",";","/")
val pairs = q.zip(o)

val prices = Map("Gizmo1" -> 3, "Gizmo2" -> 6)
val prices2 = for ((i,v)<- prices) yield(i,v*0.9)

Array(100)
new Array[Int](100)
