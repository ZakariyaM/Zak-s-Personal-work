
class person(name:String,age:Int) {
  println("Person name is" + name + age)
}

object p {
  val p = new person("Zakariya", 15)
  if (p.isInstanceOf[person]) {
    p.asInstanceOf[person]
    print("HelloWorlddddddd")
  }
}

val x = p