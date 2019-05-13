package algorithms.binarySearch

import org.scalatest._

class RecursiveBinarySearchSpec extends FunSuite with DiagrammedAssertions {
  test("RecursiveBinarySearch behaves as expected") {
    val search = new RecursiveBinarySearch

    assert(
      search.exists(
        Array(6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97),
        33
      ) == 4
    )
  }
}
