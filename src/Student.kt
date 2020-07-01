//class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age) {
//    //主构造函数
//    init {
//        println("My name is " + name + ", " + age + " year's old")
//        println("sno: " + sno + " grade: " + grade)
//    }
//    //次构造函数
//    constructor(name: String, age: Int) : this("", 0, name, age) {
//    }
//    constructor() : this("", 0) {
//    }
//}
// 无主构造函数, 只有次构造函数
//class Student : Person {
//    constructor(name: String, age: Int) : super(name, age) {
//    }
//    constructor() : this("Alice", 27) {
//    }
//}
//class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age), Study {
//    init {
//        println(name + ", " + age + " year's old~")
//        println("sno: " + sno + " grade: " + grade)
//    }
//
//    override fun readSomething() {
//        println("read first line code.")
//    }
//    override fun doHomework() {
//        println("do my Math homework.")
//    }
//}
//class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age) {
//    init {
//        println(name + ", I'm " + age + " year's old~")
//        println("sno: " + sno + ", grade: " + grade)
//    }
//
//    constructor(name: String, age: Int) : this("", 0, name, age) {
//    }
//    constructor() : this("", 0) {
//    }
//}
class Student(val sno: String = "", val grade: Int = 0, name: String = "", age: Int = 0) : Person(name, age), Study {
    init {
        println(name + ", " + age + " year's old~")
        println("sno: " + sno + " grade: " + grade)
    }
//    override fun readSomething() {
//        println("read first line code.")
//    }
//    override fun doHomework() {
//        println("do my Math homework.")
//    }
//    override fun run() {
//    }
}
