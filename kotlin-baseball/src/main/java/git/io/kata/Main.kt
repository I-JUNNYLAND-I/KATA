package git.io.kata


//fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
//    val st1 = readLine()!!.toInt()
//    var str2 = ArrayList<String>()
//
//    for (i in 0 until 7) {
//        str2.add(readLine().toString())
//    }
//    str2.distinct().sortedWith(compareBy({it.length},{it})).forEach { println(it) }
//}

fun main() {
    countGoodSubstrings("xyzzaz")
}

fun countGoodSubstrings(s: String): Int {
    var count = 0
    for (i in 0 until s.length -2) {
        val substring = s.substring(i, i + 3).map { it.toString() }
        val distinct = substring.distinct()
        if (distinct.size == 3) {
            count++
        }
    }
    return count
}