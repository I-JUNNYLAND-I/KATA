package git.io.kata

private fun sum(left: Int, right: Int)= left + right
private fun minus(left: Int, right: Int)= left - right
private fun multiply(left: Int, right: Int)= left * right
private fun divide(left: Int, right: Int)= left / right

enum class Operator(
    private val code: String,
    private val func: (Int,Int) -> Int
){
    PLUS("+", ::sum),
    MINUS("-", ::minus),
    MULTIPLY("*", ::multiply),
    DIVIDE("/", ::divide);

    fun execute(left: Int, right: Int): Int = func(left, right)

    companion object {
        private val map = values().associateBy { it.code }
        infix fun from(code: String) = map[code] ?: throw IllegalArgumentException("Blah Blah")
    }
}