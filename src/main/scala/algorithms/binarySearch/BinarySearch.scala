package algorithms.binarySearch

trait BinarySearch[T] {
  def exists(elements: Array[T], key: T): Int
}
