package git.io.kata

class Expressions(val expression: String) {
    init{
        require(expression.matches(Regex("^[0-9+\\-*/ ]+\$"))) { "잘못된 식입니다." }
    }
}