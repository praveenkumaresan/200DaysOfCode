package delegation

interface Cricket {
    fun doScore()

    fun takeWickets()
}

// Reason to use delegation than inheritance

open class OneDayCricket : Cricket {
    override fun doScore() = println("score of 50s and 100s in one day cricket are great milestone")

    override fun takeWickets() = println("5 wicket haul in one day cricket are great milestone")
}

class FiveDayCricket : Cricket {
    override fun doScore() = println("score of 150s and 200s in five day cricket are great milestone")

    override fun takeWickets() = println("10 wicket haul in five day cricket are great milestone")
}

/**
 *  We have interface Cricket and the two implementations OneDayCricket and FiveDayCricket , let's focus on introducing new object
 *  called WorldCupTournament which needs OneDayCricket or FiveDayCricket to get the actual runs, wickets. In simple form, a call to
 *  doScore() need to be executed on an implementation of Cricket
 *
 * Let's use inheritance to solve this which is a common approach where we can inherit WorldCupTournament from OneDayCricket.
 * First we need to make OneDayCricket open
*/
class WorldCupTournament : OneDayCricket()

fun main() {
    val worldCupTournament = WorldCupTournament()
    worldCupTournament.doScore()
    worldCupTournament.takeWickets()
    /**
     * This has cons as WorldCupTournament is tied only to OneDayCricket and can't be used for FiveDayCricket. This is the consequence of inheritance.
     * Also, there is a substitutability problem where we didn't mean to have WorldCupTournament as kind of OneDayCricket, but sadly it is implied from inheritance.
     */
    val oneDayCricket: OneDayCricket = worldCupTournament // substitutability problem
}

/**
 * Delegation Using By
 */

class WorldCupSeries : Cricket by OneDayCricket()

fun main(args: Array<String>) {
    val worldCupSeries = WorldCupSeries()
    println("inside world cup series")
    worldCupSeries.doScore()
    worldCupSeries.takeWickets()
    // val oneDayCricket: OneDayCricket = worldCupSeries //Assignment of instance of WorldCupSeries is not possible to a reference of type OneDayCricket
}

/**
 * In the case of kotlin delegation , calls to methods like doScore() weren't implemented in WorldCupSeries, instead they were sent
 * to the baseClass OneDayCricket or FiveDayCricket. In the case of delegation, compiler creates methods with the WorldCupSeries
 * and does the routing. In effect, when we can worldCupSeries.doScore() we are calling the mentionedd doScore() inside WorldCupSwries.
 * Kotlin Compiler routes the call to the delegate which is the instance of OneDayCricket
 *
 * In summary
 * Inheritance one wanted an object of a class to be used in the place of object of another class where in delegation, one wanted an object
 * of a call to simply make use of an object of another class
 */
