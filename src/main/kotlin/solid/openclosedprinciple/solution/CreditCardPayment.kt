package solid.openclosedprinciple.solution

import solid.openclosedprinciple.Money

/**
 * This is closed for modification
 */
class CreditCardPayment: Payment {
    override fun pay(money: Money) {
        println("I paid $money with credit card")
    }
}