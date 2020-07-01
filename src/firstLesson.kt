//import java.lang.Integer.max
//fun main() {
//    println("hello,kotlin~ My name is Gary~~你好，我叫尹文楷，今年二十六岁，最想做的事情是创业做老板~~");
//}
//fun main() {
//    val v1 = 20
//    val v2 = 30
//    println("vi is " + v1 + ",v2 is " + v2)
//    var a: Int = 10
//    a = a * 10
//    println("a is " + a)
//    val res = largeNumber(5, 7)
//    println(res)
//    val int1: Int = 380
//    val int2: Int = 390
//    println(largeNumber(int1, int2))
//    var a: Int = 1000
//    a = a * 1000
//    println("a is " + a)
//}
//fun largeNumber(num1: Int, num2: Int): Int {
//    return 0
//    return max(num1, num2)
//}
//fun largeNumber(num1: Int, num2: Int) = max(num1, num2)
fun main() {
//    val n1: Int = 188
//    val n2: Int = 190
//    println("large number is " + largeNumber(n1, n2))
//    println("Score: " + getScore("Tom"))
//    val num: Int = 10
//    val num: Double = 10.678;
//    checkNumber(num)
//    for (i in 0..10) {
//        println(i)
//    }
// 双闭空间
// [0, 10]
//    for (i in 0 until 10 step 2) {
//        println(i)
//    }
//    for (i in 0 until 10 step 2) {
//        println(i)
//    }
// 左闭右开
// [0, 10)
//  for (i in 10 downTo 0) {
//      println(i)
//  }
// 双闭空间
// [10, 0]
// for(i in 0..10 step 2) {
//     println(i)
// }
// for(i in 0..10 step 2) {
//     println(i)
// }
// for(i in 0 until 10 step 2) {
//     println(i)
// }
// for(i in 10 downTo 0 step 3) {
//     println(i)
// }
//    val person = Person()
//    person.name = "Aaron"
//    person.age = 28
//    person.eat()
//    val student = Student("20200505", 2)
//    student.name = "Alice"
//    student.age = 32
//    student.eat()
//    val student = Student("20200505", 2, "Yinwenkai", 27)
//    val student = Student()
//    val student = Student("Gary", 24)
//    val student = Student()
//    val student = Student("20200505", 2, "Gary", 26)
//    println(student.sno)
//    println(student.age)
//    println(student.name)
//    println(student.grade)
//    doStudy(student)
//    val data1 = DataLesson("宠确幸猫粮", 20.99)
//    val data2 = DataLesson("宠确幸猫粮", 20.99)
//    println("品牌: " + data1.brand)
//    println("data1 is equals data2 " + (data1 == data2))
//    Singleton.getInstance()
//    val student = Student()
//    val student = Student("Yinwk", 22)
//    val student = Student("20200505", 4, "Yinwk", 27)
//    val list = listOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    list.add("Peach");
//    for (fruit in list) {
//        println(fruit)
//    }
//    val list = mutableListOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    list.add("Peach")
//    for(fruit in list) {
//        println(fruit)
//    }
//    val set = setOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    set.add("Peach")
//    for(fruit in set) {
//        println(fruit)
//    }
//    val set: MutableSet<String> = mutableSetOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    set.add("Lemon");
//    for (fruit in set) {
//        println(fruit)
//    }
//    val map: MutableMap<String, Int> =
//        mutableMapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Peach" to 4, "Watermelon" to 5, "Grape" to 6)
//    for ((fruit, order) in map) {
//        println("my favorite fruit is ${fruit}, the order is ${order}")
//    }
//    val list = mutableListOf<String>("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    println(list.maxBy({fruit -> fruit.length}))
//    println(list.maxBy { fruit -> fruit.length })
//    println(list.maxBy {it -> it.length})
//    println(list.maxBy { it.length })
//    list.map {fruit -> println(fruit.toUpperCase())}
//    list.map { println(it.toUpperCase()) }
//    list.filter { it.length > 5 }.map { println(it.toUpperCase()) }
//    val list = listOf("Orange", "Banana", "Apple", "Watermelon", "Peach", "Grape", "PineApple")
//    list.add("Pear")
//    for (fruit in list) {
//        println(fruit);
//    }
//    val list: MutableList<String> = mutableListOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    list.add("Pear")
//    for (fruit in list) {
//        println(fruit)
//    }
//    val set = setOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    set.add("Pear")
//    for (fruit in set) {
//        println(fruit)
//    }
//    val set: MutableSet<String> = mutableSetOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    set.add("Pear")
//    for (fruit in set) {
//        println(fruit)
//    }
//    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Peach" to 4, "Watermelon" to 5, "Grape" to 6)
//    for ((fruit, index) in map) {
//        println("I love ${fruit}, the index is ${index}")
//    }
//    val map: MutableMap<String, Number> = mutableMapOf<String, Number>(
//        "Apple" to 1,
//        "Banana" to 2,
//        "Orange" to 3,
//        "Peach" to 4,
//        "Watermelon" to 5,
//        "Grape" to 6
//    )
//    map.put("Pear", 7);
//    for ((fruit, index) in map) {
//        println("I love ${fruit}, the index is ${index}")
//    }
//    val list: MutableList<String> = mutableListOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    val fruit = list.maxBy {
//        val _fruit = it
//        _fruit.length
//    }
//    println(fruit)
//    val list: MutableList<String> = mutableListOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    list.add("Pear");
//    val upperCaseList = list.map {
//        it.toUpperCase()
//    }
//    for(fruit in upperCaseList) {
//        println(fruit);
//    }
//    val list: MutableList<String> = mutableListOf("Apple", "Banana", "Orange", "Peach", "Watermelon", "Grape")
//    list.add("Pear");
//    val filterList = list.filter { it.length > 5 }.map { it.toUpperCase() }
//    for (fruit in filterList) {
//        println(fruit);
//    }
//    Thread({
//        println("I'm Gary")
//    }).start()
//    doStudy(Student())
//    println(getTextLength("watermelon"))
//    println(getTextLength(null))
}

//fun doStudy(study: Study?) {
//    study?.run()
//    study?.doHomework()
//    study?.readSomething()
//}

//fun getTextLength(text: String?) = if (text != null) text.length else 0
//fun getTextLength(text: String?) = text?.length ?: 0


//fun largeNumber(num1: Int, num2: Int): Int {
//    var result: Int = 0
//    if (num1 > num2) {
//        result = num1
//    } else {
//        result = num2
//    }
//    return result
//    val result: Int = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//    return result
//    return if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//}
//fun largeNumber(num1: Int, num2: Int): Int = if (num1 > num2) {
//    num1
//} else {
//    num2
//}
//fun largeNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
//fun getScore(name: String): Int {
//    return if (name == "Tom") {
//        100
//    } else if (name == "Gary") {
//        95
//    } else if (name == "Alice") {
//        86
//    } else if (name == "Lily") {
//        78
//    } else if (name == "Aaron") {
//        90
//    } else {
//        0
//    }
//    return when (name) {
//        "Tom" -> 100
//        "Gary" -> 95
//        "Alice" -> 86
//        "Lily" -> 78
//        "Aaron" -> 90
//        else -> 0
//    }
//}
//fun getScore(name: String) = when (name) {
//    "Tom" -> 100
//    "Gary" -> 95
//    "Alice" -> 86
//    "Lily" -> 78
//    "Aaron" -> 90
//    else -> 0
//}
//fun checkNumber(num: Number) = when (num) {
//    is Int -> println("The num type is integer")
//    is Double -> println("The num type is double")
//    else -> println("The num type is not support")
//}
//fun getScore(name: String) = when {
//    name.startsWith("Tom") -> 100
//    name == "Gary" -> 95
//    name == "Alice" -> 86
//    name == "Lily" -> 78
//    name == "Aaron" -> 90
//    else -> 0
//}


