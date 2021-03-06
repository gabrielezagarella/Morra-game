package morra

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */

open class Morra (){

    open var arg:String = " "

    fun morra(): String{
        try {
            if (arg != "paper" && arg != "scissor" && arg != "stone") {
                return " "
            }
            val casual = arrayOf("paper", "scissor", "stone")
            val randomIndex = Math.random()* casual.count()
            val randomElement = casual[randomIndex.toInt()]

            if (arg == randomElement){
                return "Result: You draw! Player: ${arg}, Computer: ${randomElement}"
            }
            else if (arg == "paper" && randomElement == "stone" ||
                arg == "stone" && randomElement == "scissor" ||
                arg == "scissor" && randomElement == "paper"){
                return "Result: You win! Player: ${arg}, Computer: ${randomElement}"
            }
            else
                return "Result: You lose! Player: ${arg}, Computer: ${randomElement}"
        }
        catch (e: NullPointerException) {
            throw Error("Error")
        }
    }
}










