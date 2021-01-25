def signum(n:Int):Int = {
  if (n>0) 1 else if (n < 0) -1 else 0
}
signum(-1)

//2
assert({}==())

//3

var y:Int =0
val x :Unit = y = 1

//
for(i<-10.to (0,-1)) {
  println(i)
}

//5
def countdown(n:Int) = {
  for(i<-n.to (0,-1))
    println(i)
}

countdown(10)

//7

"Hi".map(BigInt(_)).product

//8

def product(s:String):String = {
  s.map(BigInt(_)).product.toString()
}

product("hi")

//9
def product1(s:String):String = {
  s.map(BigInt(_)).product.toString()  
}