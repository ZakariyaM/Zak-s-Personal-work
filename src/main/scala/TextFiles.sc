import java.io._
import java.io.PrintWriter
val pw = new File("/Users/zkariy/IdeaProjects/Zak's Scala work practice/Zak.txt")
print(pw.getAbsolutePath)
val p = new PrintWriter(pw)
p.write("Hello World!")
p.close()

