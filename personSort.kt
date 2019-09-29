// cerner_2^5_2019

enum class SortType(val type: String) {
    AGE("age"),
    NAME("name")
}

data class Person(val name: String, val age: Int)

fun sortPeople(people: List<Person>, sortType: SortType) : List<Person> {
    var result = listOf<Person>()
 
    when (sortType) {
        SortType.AGE -> result = people.sortedBy { it.age }
        SortType.NAME -> result = people.sortedBy { it.name }
        else -> {
            print("invalid sort type")
        }
    }

    return result
}

fun main(args: Array<String>) {
    val kids = listOf(Person("Zack", 11), Person("Ted", 15), Person("Pierce", 16))
    val nameSortedList = sortPeople(kids, SortType.NAME)
    println("Sorted by Name:")
    println(nameSortedList)
    val ageSortedList = sortPeople(kids, SortType.AGE)
    println("Sorted by Age:")
    println(ageSortedList)
}
