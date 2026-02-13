package week2

class Loan (
    val bookTitle : String,
    var borrower : String,
    val loanDuration: Int = 1
){
    fun calculateFine(): Int =
        if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else { 0 }
}







