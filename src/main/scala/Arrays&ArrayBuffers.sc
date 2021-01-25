import scala.collection.mutable.ArrayBuffer

//1
val a = new Array[Int](10)
for(i <- 0 until a.length) a(i) = scala.util.Random.nextInt(10)
a
//2
val s = Array(1,2,3,4,5)
for( i<-1 until (s.length, 2))  {
  val t = s(i-1)
  s(i-1) = s(i)
  s(i) = t
}

s
//Array[Int] = Array(2, 1, 4, 3, 5)

//3
for ( i<-0 until s.length) yield {
  if ( i%2 == 1) s(i-1)
  else if(i == s.length-1) s(i)
  else s(i+1)
}

//4
val a = Array(1,2,3,5,4,8,6)
a.sorted.reverse

val b = ArrayBuffer(1,5,4,9,6,7)
b.sorted.reverse


import scala.collection.mutable.ArrayBuffer
val num =  Array (1,2,3,4)
val s = Array("Hi","A","L","C")
s(3)

val b = new ArrayBuffer[Int]()
b+=1
b++=Array(1,2,3,5)
b++=Array(8,13,21)
b.dropRight(5)
b.insert(2, 8)
//b.toArray
b.remove(2,4)
//b.toArray
b

for (i<- 0 until b.length){
  println(s"$i:${b(i)}")
}

0 until b.length by 2

val u = Array(1,2,3,4,5)
val y = for (i<-u)yield (i*2)


for (i<-u if i %2 ==0) yield (2*i)

val positionsToRemove = for (i<- u.indices if u(i)<0 ) yield i

Array(2,1,3,4,5).sorted

val martix = Array.ofDim[Double](3,4)

