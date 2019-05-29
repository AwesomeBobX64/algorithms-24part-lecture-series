package algorithms.unionFind

class MapQuickUnion[T] extends UnionFind[T] {
  private var elements = Map.empty[T, T]

  def union(a: T, b: T): Unit = {
    if (!connected(a, b)) {
      elements = elements.updated(
        findRoot(a),
        findRoot(b)
      )
    }
  }

  def connected(a: T, b: T): Boolean = findRoot(a) == findRoot(b)

  @scala.annotation.tailrec
  private def findRoot(a: T): T = {
    val aValue = find(a)

    if (aValue == a) a else findRoot(aValue)
  }

  def find(a: T): T = elements.getOrElse(
    a,
    {
      elements = elements.updated(a, a)

      a
    }
  )

  def count: Int = elements.values.map(findRoot).toSet.size
}
