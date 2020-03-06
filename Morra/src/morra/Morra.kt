package morra

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */

open class Morra (){
    open var arg:String = " "
    fun morra() : String{
        val casual = arrayOf("paper", "scissor", "stone")
        val randomIndex = Math.random()* casual.count()
        val randomElement = casual[randomIndex.toInt()]

        if (arg == randomElement){
            return "Result: You draw! Player: ${arg}, computer: ${randomElement}"
        }
        else if (arg == "paper" && randomElement == "stone" ||
            arg == "stone" && randomElement == "scissor" ||
            arg == "scissor" && randomElement == "paper"){
            return "Result: You win! Player: ${arg}, computer: ${randomElement}"
        }
        else
            return "Result: You lose! Player: ${arg}, computer: ${randomElement}"
    }
}








