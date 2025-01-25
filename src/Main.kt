fun main() {

    val nameBook = "Игровой практикум"
    bookTitle(nameBook)
    val nameBookTwo = null
    bookTitle(nameBookTwo)
    println()

    var numberOne = 6
    val numberTwo = 2
    println(DivideIfWhole(numberOne, numberTwo))
    println(DivideIfWholeTwo(numberOne, numberTwo))
    numberOne = 7
    println(DivideIfWhole(numberOne, numberTwo))
    println(DivideIfWholeTwo(numberOne, numberTwo))
    println()

    val array = arrayOf("Привет","как", null, "дела")
    println(array.contentDeepToString())
    println(newArrayOfArrayElementsThatAreNotNull(array).contentDeepToString())

}

/*
Написать функцию, которая выводит в консоль Вашу любимую книгу.
Входной параметр – название книги.
Если в аргументы передается значение null, вывести фразу «У меня нет любимой книги».
*/
fun bookTitle(nameBook: String?){
    println(nameBook ?: "У меня нет любимой книги")
}

/*
Создайте функцию, которая возвращает сколько раз целое число может быть разделено на другое целое число без остатка.
Функция должна возвращать null, если результатом деления является не целое число.
Назовите функцию DivideIfWhole.
Дополнительно написать решение, в случае, когда нет ни одного деления без остатка – вывести ноль.
Рефакторинг сделать с применением оператора ?:
*/
fun DivideIfWhole(numberOne: Int, numberTwo: Int): Int? {
    return if (numberOne % numberTwo == 0) numberOne / numberTwo else null
}

fun DivideIfWholeTwo(numberOne: Int, numberTwo: Int): Int {
    return if (numberOne % numberTwo == 0) numberOne / numberTwo else null ?: 0
}

/*
Дан массив строк array = arrayOf("Привет","как", null, "дела").
Создать новый массив, который будет состоять из элементов массива array, которые не являютсяnull.
Вывести их в консоль.
*/
fun newArrayOfArrayElementsThatAreNotNull(array: Array<String?>): Array<String> {
    val result = mutableListOf<String>()
    array.forEach { a -> if (a != null) result.add(a) }
    return result.toTypedArray()
}