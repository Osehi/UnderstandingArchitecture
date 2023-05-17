package solid.openclosedprinciple

/**
 * Probem => if I have to add a new payment type what happens?
 * I will have to change or modify the class
 * I will need to add an else-if logic - this is not efficient- see solution folder...
 */
class PaymentManager {

    private lateinit var paymentType: PaymentType
    fun pay(money: Money) {
        if (paymentType == PaymentType.CASH) {
            // some code here - pay cash
        } else {
            // some code here - pay via credit
        }
    }
}

enum class PaymentType {
    CASH,
    CREDIT
}

class Money {

}