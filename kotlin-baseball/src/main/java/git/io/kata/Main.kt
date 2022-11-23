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
    subarraySum(intArrayOf(1, 2, 3), 3)
}


fun addStrings(num1: String, num2: String): String { (num1.toBigDecimal().add(num2.toBigDecimal())).toString() }

}


fun rotate(matrix: Array<IntArray?>?) {}

//    val arr1 = ArrayList<String>()
//
//    for (i in 0 until st1) {
//        val st2 = readLine().toString()
//        arr1.add(st2)
//    }
//fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
//    val data1 = readLine().toInt()
//
//    if(data1%4 == 0 && (data1 %100 != 0 || data1 % 400 == 0)){
//        println("1")
//    }else{
//        println("0")
//    }
//}