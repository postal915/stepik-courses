package one.bubble_sort

/*
* Реализовать сортировку пузырьком (или другим более увлекательным способом),
* дополнив функцию One.Sorting.bubbleSort.
* https://stepik.org/lesson/207275/step/3?unit=180945
* */

fun main() {

    val sampleInputOne = listOf("5", "4", "3", "2", "1", "6", "7", "8", "9", "10")
    val sampleInputTwo = listOf("5", "4", "3", "2", "1", "6", "7", "2", "8", "9", "2", "10")

    val bubbleSort = bubbleSort(sampleInputOne)
    val bubbleSort1 = bubbleSort(sampleInputTwo)

    println(bubbleSort.contentToString())
    println(bubbleSort1.contentToString())
}

fun bubbleSort(inputList: List<String>): IntArray {

    var buffArray = emptyArray<Int>()

    for (item in inputList)
        if (item.toIntOrNull() != null)
            buffArray += item.toInt()

    for (i in buffArray.indices) {
        for (j in i + 1 until buffArray.size) {
            if (buffArray[i] > buffArray[j]) {
                val buff = buffArray[i]
                buffArray[i] = buffArray[j]
                buffArray[j] = buff
            }
        }
    }

    return IntArray(buffArray.size) { i: Int -> buffArray[i] }
}