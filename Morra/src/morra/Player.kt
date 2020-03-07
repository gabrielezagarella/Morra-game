package morra

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */

class Player(var name:String, var surname:String): Morra() {
    init {
        this.name = name
        this.surname = surname
    }
    var nikname = name + " " + surname

    override var arg = " "

    fun play(choice: String) {

        arg = choice

        println("'***************************************'")
        println("Welcome to the game of morra ${nikname}")
        println(super.morra())
    }
}