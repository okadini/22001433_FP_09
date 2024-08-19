import scala.io.StdIn.readInt

object q2 {
    def main(args:Array[String]) = {
        
        print("Enter an integer : ")
        var num = readInt()

        val result = num match {
            case num if num < 0 => "Negative"
            case num if num == 0 => "Zero"
            case num if num % 2 == 0 => "Even"
            case _ => "Odd"
        }

        println("Number is " + result)
    }
}