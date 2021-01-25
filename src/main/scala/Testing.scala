class Person(name:String,age:Int) {
  println("Person name is" + name + age)
}
object p {
  val p = new Person("Zakariya", 15)
  p match {
    case person: Person => println("HelloWorlddddddd")
  }
}

abstract class person{
  def id:Int
  def name : String
  val id2 : Int
  val p : String
}

class person2 extends person{
   def id: Int = 1
   def name: String = "Hello"
   val id2: Int = 2
   val p: String = "World"
}

