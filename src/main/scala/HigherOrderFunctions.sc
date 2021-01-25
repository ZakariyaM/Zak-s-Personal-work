
def values(fun:(Int) => Int, low:Int, high: Int) =
  for (i<-low to high) yield(i,fun(i))
val result = values(x => x * x,-5,5)

import scala.collection.mutable.ArrayBuffer
import scala.math._
val a = Array(2,9,8,3,6)
a.reduceLeft(max)

def fact(x:Int) = (1 to x).foldLeft(1)(_*_)
fact(5)

def largest(fun:(Int)=> Int, inputs:Seq[Int]) = {
  val x = inputs.map(fun)
  val d = x.indexOf(x.max) + 1
  println(d)
}
largest(x => 10 * x - x * x, 1 to 10)

def adjustToPair(f:(Int,Int)=> Int) = {
  val pairs = (1 to 10) zip (11 to 20)
  pairs.map(x => f(x._1, x._2))
}
adjustToPair((x,y)=> x*y)


val a = Array("Hello", "World")
val b = Array(1,2)
a.corresponds(b)(_.length==(_))==false


def unless(f: =>Boolean) (block: => Unit) {
  if (!f) block
}
val s = 10
unless(s==9){print("s")}

//def unless(condition: => Boolean)(block: => Unit) {
//  if (!condition) block
//}
//val pos = 10
//unless(pos == 9) { println("ok") }


val salaries = Seq(20000, 70000, 40000)
val newSalaries = salaries.map( _ * 2) // List(40000, 140000, 80000)


val  s = Set(1,5,3,8)
s contains 0
Set(1,3) subsetOf(s)

s.mkString("*")
val primes = Set(2,3,5,7)
val d = s.diff(primes)
Vector(1,2,3,4):+ 5

val numbers = ArrayBuffer(1,2,3,4)
numbers+=5

def sum(a: Int, b: Int) : Int = if (a>b) 0 else a + sum(a+1, b)
sum(3,5)

def sum(f: Int=> Int, a:Int, b:Int): Int = if (a>b) 0 else f(a) + sum(f,a+1,b)

val total = sum((a: Int) => a + 1, 1, 3)

def sum2(f:Int => Int, a: Int, b:Int): Int =
  (a to b).fold(0)((v: Int, i: Int) => v + f(i))
