package algorithms.unionFind

import org.scalatest._

class MapWeightedQuickUnionSpec extends FunSuite with DiagrammedAssertions {
  test("MapWeightedQuickUnion should behave as expected") {
    val myUnionFind = new MapWeightedQuickUnion[Int]

    myUnionFind.union(4, 3)
    myUnionFind.union(3, 8)
    myUnionFind.union(6, 5)
    myUnionFind.union(9, 4)
    myUnionFind.union(2, 1)
    myUnionFind.union(5, 0)
    myUnionFind.union(7, 2)
    myUnionFind.union(6, 1)
    myUnionFind.union(7, 3)

    assert(myUnionFind.getSizes.values.max == 3)
  }
}
