package git.io.kata

enum class Operator2(a: Int, b: Int, func: (Int, Int) -> Int) {
    Plus(1, 2, { a, b -> a + b }),
}