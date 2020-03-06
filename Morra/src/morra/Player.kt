package morra

/** Commento Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 */
class Player(var name:String, var surname:String, var choice:String): Morra() {
    init {
        this.name = name
        this.surname = surname
        this.choice = choice
    }
    var nikname = name + " " + surname
    override var arg = choice

    fun player() {
        println("'**************************************'")
        println("Welcome to the game of morra ${nikname}")
        println(super.morra())
    }
}