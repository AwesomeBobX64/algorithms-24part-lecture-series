package algorithms.binarySearch

class RecursiveBinarySearch extends BinarySearch[Int] {
  def exists(elements: Array[Int], key: Int): Int = recursiveSearch(elements, key, elements.length, 0)

  @scala.annotation.tailrec
  private def recursiveSearch(elements: Array[Int], key: Int, high: Int = 0, low: Int = 0): Int = {
    val mid: Int = low + (high - low) / 2

    if (low > high) {
      -1
    } else {
      val difference = key.compareTo(elements(mid))
      if (difference == 0) {
        mid
      } else if (difference < 0) {
        recursiveSearch(elements, key, mid - 1, low)
      } else {
        recursiveSearch(elements, key, high, mid + 1)
      }
    }
  }
}
