package algorithms.unionFind

import org.scalatest._

class MapQuickFindSpec extends FunSuite with DiagrammedAssertions {
  test("MapQuickFind should behave as expected") {
    val myUnionFind = new MapQuickFind[Int]

    myUnionFind.union(0, 0)
    myUnionFind.union(7, 0)
    myUnionFind.union(3, 4)
    myUnionFind.union(7, 4)

    assert(myUnionFind.count == 1)

    assert(myUnionFind.connected(3, 4))
  }
}
