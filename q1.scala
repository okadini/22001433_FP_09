import scala.io.StdIn.readLine

object q1 {
    def main(args:Array[String]) = {
        
        def calculateInterest(depositAmount:Double):Double = {
            depositAmount match {
                case depositAmount if (depositAmount >= 0 && depositAmount < 20000) => depositAmount * 102 / 100
                case depositAmount if (depositAmount >= 20000 && depositAmount < 200000) => depositAmount * 104 / 100
                case depositAmount if (depositAmount >= 200000 && depositAmount < 2000000) => depositAmount * 103.5 / 100 
                case depositAmount if (depositAmount >= 2000000) => depositAmount * 106.5 / 100  
                case _ => 0.0
            }
        }

        println("Deposit Amount : Rs.15 000     Interest : Rs." + calculateInterest(15000))
        println("Deposit Amount : Rs.50 000     Interest : Rs." + calculateInterest(50000))
        println("Deposit Amount : Rs.1 500 000  Interest : Rs." + calculateInterest(1500000))
        println("Deposit Amount : Rs.3 000 000  Interest : Rs." + calculateInterest(3000000))
    }
}