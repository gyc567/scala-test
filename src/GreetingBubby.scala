import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
/**
  * Created by eric567 [email:gyc567@126.com] 
  * on 10/18/2016.
  */
object GreetingBubby {
  def main(args: Array[String]): Unit = {
    println("hello world")
    val now = new Date
    val df = getDateInstance(LONG, Locale.CHINA)
    println(df format now)
    var rt=addOne(3)
    println(rt)

   // val three = addOne(2)
    def three() = 1 + 2
    println(three)
  }

  def addOne(m: Int): Int = m + 1
}
