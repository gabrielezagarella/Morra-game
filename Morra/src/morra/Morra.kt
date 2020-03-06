package morra

/** Commento Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */
open class Morra (){
    open var arg:String = " "
    fun morra() : String{
        var casual = arrayOf("paper", "scissor", "stone")
        var randomIndex = Math.random()* casual.count()
        var randomElement = casual[randomIndex.toInt()]

        if (arg == randomElement){
            return "Result: You draw! morra.Player: ${arg}, computer: ${randomElement}"
        }
        else if (arg == "paper" && randomElement == "stone" ||
            arg == "stone" && randomElement == "scissor" ||
            arg == "scissor" && randomElement == "paper"){
            return "Result: You win! morra.Player: ${arg}, computer: ${randomElement}"
        }
        else
            return "Result: You lose! morra.Player: ${arg}, computer: ${randomElement}"
    }
}








