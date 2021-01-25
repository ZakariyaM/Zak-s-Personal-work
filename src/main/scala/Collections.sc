import scala.collection.SeqView.Sorted
import scala.collection.SortedSet
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

val names = List("Zak","s", "ss")

for (n<- names) yield n.toUpperCase()
for (i<-1 to 10) yield i*i
(1 to 10).map(i=> i * i )
names.flatMap(_.toUpperCase)
val b = ArrayBuffer("kaz","zak","lol")
b.map(_.toUpperCase)
names.foreach(println)
val words = ("Zak", " SS", "Lololol")

List(1,7,2,9).foldRight(0)(_-_)
(1 to 10).scanRight(0)(_ + _)

val price = List(5.0,25.0,9.95)
val quantities = List(10,2,1)

price zip(quantities) map {p=> p._1 * p._2}

"Zak".zipWithIndex



def array2Dim(a: Array[Int], dim: Int): Array[Array[Int]] = a.grouped(dim).toArray

array2Dim(Array(1,2,3,4,5,6),3)



val a = Array("Hello", ", ", "world !")

println(a.reduceLeft(_ + _))

"Hello World".mkString(",")

val s = scala.collection.mutable.SortedMap ("Alice" -> 10, "Dan" -> 2)
val z = s("Alice")
s("Dan")=10


val y = (2,4.5,"Hello")
val second = y._2
val first = y._1
val last = y._3


val boo = Array("H","E","L","L","O")
val num = Array(1,2,3,4,5)
val sync = boo.zip(num)

val prices =  Map("Gizmo1"  -> 53,"Gizmo2"  -> 45)
val prices2 = for ((k,v)<- prices) yield (k, v*0.9)


val cars = Map("Merc"->5000,"BMW"->300)
val cars2 = for ((k,v)<- cars) yield (k, v*0.5)

val days = scala.collection.mutable.LinkedHashMap(
  "Monday" -> java.util.Calendar.MONDAY,
  "Tuesday" -> java.util.Calendar.TUESDAY,
  "Wednesday" -> java.util.Calendar.WEDNESDAY,
  "Thursday" -> java.util.Calendar.THURSDAY,
  "Friday" -> java.util.Calendar.FRIDAY,
  "Saturday" -> java.util.Calendar.SATURDAY,
  "Sunday" -> java.util.Calendar.SUNDAY
)

import scala.math._

def minmax(values : Array[Int]) = {
  print(values.max," is Largest ",values.min, " is Smallest ")
}

minmax(Array(1,2,5,53,234))

"Hello".zip("World")

for (i<-1 to(20)){
  println(i+" "+pow(i,2))
}



val num = 3.14
val fun =  3 * (_:Double)

Array(3.14,1.42,2.0).map(fun)

def one (f:(Double)=> Double) = f(0.25)
one (fun)

(1 to 9).map("±" * _).foreach(println _)

(1 to 9).reduceLeft(_ * _)

"Chelsea need a new manager immediately" .split(" ") sortWith(_.length<_.length)





