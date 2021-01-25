val message = "hello "
implicit val name = "world!"
def disp(implicit name : String) = message + name

// Implicit parameter wiil be passed here
val result = disp

// Implicit parameters will not be passed
val result2 = disp("GFG!")
println("With Implicit parameters:")
println(result)
println("Without Implicit parameters:")
println(result2)

