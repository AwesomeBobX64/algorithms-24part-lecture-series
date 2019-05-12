package algorithms.unionFind

import org.scalatest._

class MapQuickUnionSpec extends FunSuite with DiagrammedAssertions {
  test("MapQuickUnion should behave as expected") {
    val myUnionFind = new MapQuickUnion[Int]

    myUnionFind.union(0, 0)
    myUnionFind.union(7, 0)
    myUnionFind.union(3, 4)
    myUnionFind.union(7, 4)

    assert(myUnionFind.count == 1)

    assert(myUnionFind.connected(3, 4))
  }
}
