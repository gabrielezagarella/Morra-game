import morra.Player

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */

fun main(args: Array<String>){
    var roundOne = Player("Gabriele", "Zagarella", "paper")
    roundOne.play()

    var roundTwo = Player("Luca", "Rossi", "stone")
    roundTwo.play()

    var roundThree = Player("Andrea", "Bianchi", "scissor")
    roundThree.play()

}