fun main() {

    val totalPrice = 20_000

    val regularCustomer: Boolean = true
    val regularCustomerDiscount = 1

    val discount = 100
    val discountStart = 1_000

    val discountPercentage = 5
    val discountStartPercentage = 10_000

    var discountedAmount = totalPrice
    if (totalPrice > discountStartPercentage) {
        var personalDiscount = ((totalPrice.toDouble() / 100) * discountPercentage).toInt()
        discountedAmount -= personalDiscount
        if (regularCustomer) {
            discountedAmount -= ((discountedAmount.toDouble() / 100) * regularCustomerDiscount).toInt()
        }
    } else if (totalPrice > discountStart) {
        discountedAmount = totalPrice - discount
    }

    println(discountedAmount)

}