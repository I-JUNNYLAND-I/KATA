package git.io.kata

import java.util.stream.Collectors


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
   val s = "adab"
    val t = "Adsaf"

    val n = t.length
    val c = t.toCharArray()
    for (i in 0 until n) {
        if (c[i] in 'a'..'z') {
            c[i] = (c[i] - 'a' + 'A').toChar()
        }
    }
}
