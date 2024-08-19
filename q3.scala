object q3 {
    def main(args:Array[String]) = {
        
        //function to convert a character to uppercase
        def toUpperChar(char:Char) : Char = {

            if(char >= 'a' && char <= 'z') {
                (char - 32).toChar
            }
            else {
                char
            }
        }

        //function to convert a character to lowercase
        def toLowerChar(char:Char) : Char = {

            if(char >= 'A' && char <= 'Z') {
                (char + 32).toChar
            }
            else {
                char
            }
        }

        //function to convert an entire string to uppercase
        def toUpperStr(str:String):String = {

            str.map(toUpperChar)
        }

        //function to convert an entire string to lowercase
        def toLowerStr(str:String):String = {

            str.map(toLowerChar)
        }

        def formatNames(name:String,formatFunc:String => String):String = {
            formatFunc(name)
        } 

        println("Benny => " + formatNames("Benny",toUpperStr))

        println("Niroshan => " + formatNames("Niroshan",name => {
            val firstPart = toUpperStr(name.substring(0,2))
            val secondPart = toLowerStr(name.substring(2))
            firstPart + secondPart
        }))

        println("Saman => " + formatNames("Saman",toLowerStr))

        println("Kumara => " + formatNames("Kumara",name => {
            val firstPart = toUpperStr(name.substring(0,1))
            val secondPart = toLowerStr(name.substring(1,5))
            val thirdPart = toUpperStr(name.substring(5))
            firstPart + secondPart + thirdPart
        }))

    }
}