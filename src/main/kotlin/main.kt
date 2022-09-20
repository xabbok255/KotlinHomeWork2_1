fun main() {
    val amount = 10000
    val fee = amount * 0.0075f
    val minimumFee = 35

    val transferFee = if (fee < minimumFee) minimumFee else fee
    println("Transfer Fee: ${transferFee.toInt()}₽")
}