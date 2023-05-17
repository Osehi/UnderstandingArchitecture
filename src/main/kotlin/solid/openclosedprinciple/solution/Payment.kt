package solid.openclosedprinciple.solution

import solid.openclosedprinciple.Money

/**
 * This is open for extension
 */
interface Payment {

    fun pay(money: Money)
}