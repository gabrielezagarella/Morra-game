import morra.Player

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */

fun main(args: Array<String>){
    var roundOne = Player("Gabriele", "Zagarella")
    roundOne.play("paper")

    var roundTwo = Player("Luca", "Rossi")
    roundTwo.play( "scissor")

    var roundThree = Player("Andrea", "Bianchi")
    roundThree.play("stone")

}