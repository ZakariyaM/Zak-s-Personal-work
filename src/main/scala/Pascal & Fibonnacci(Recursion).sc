//1 (0,0)
//1 1 (0,1) (1,1)
//1 2 1 (0,2)(1,2)(2,2)
//1 3 3 1 (0,3) (1,3) (2,3)(3,3)
//1 4 6 4 1 (0,4) (1,4)(2,4) (3,4) (4,4)
////...
//Above I traced Pascal to actually understand how it worked

def pascal(c: Int, r: Int): Int = {
  if (c == 0 || c == r) 1
  else pascal(c - 1, r - 1) + pascal(c ,r-1)
}

pascal(1,3)
//Displaying Pascal Triangle to help see how if traced
println("Pascal's Triangle")
for (row <- 0 to 10) {
  for (col <- 0 to row)
    print(pascal(col, row) + " ")
  println()
}
//Using recursion
def countChange(money: Int, coins: List[Int]): Int = {
  if (coins.isEmpty) 0
  else if (money - coins.head == 0) 1
  else if (money - coins.head < 0) 0
  else countChange(money - coins.head, coins) + countChange(money, coins.tail)
}

countChange(4,List(1,2))


//Fibonnacci displays n which would be the position in the sequence
//I use a selection statement to check if n is if less than 3 as if it is then it must be equal to 1
// This is because the first 3 numbers in the sequence are not greater than the value 1
def fibonacci(n: Int): Int =
  if (n < 3) 1
  else fibonacci(n - 1) + fibonacci(n - 2)

fibonacci(10)



