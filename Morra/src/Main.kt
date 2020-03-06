import morra.Player

/** Commento Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */
fun main(args: Array<String>){
    var roundOne = Player("Gabriele", "Zagarella", "paper")
    println(roundOne.player())

    var roundTwo = Player("Luca", "Rossi", "stone")
    println(roundTwo.player())

    var roundThree = Player("Andrea", "Bianchi", "scissor")
    println(roundThree.player())

}