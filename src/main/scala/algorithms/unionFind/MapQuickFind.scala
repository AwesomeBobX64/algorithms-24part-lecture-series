package algorithms.unionFind

class MapQuickFind[T] extends UnionFind[T] {
  private var elements = Map.empty[T, T]

  def union(a: T, b: T): Unit = {
    if (!connected(a, b)) {
      val aId = find(a)
      val bId = find(b)

      elements ++= elements.collect {
        case (key, value) if value == aId => key -> bId
      }
    }
  }

  def connected(a: T, b: T): Boolean = find(a) == find(b)

  def find(a: T): T = elements.getOrElse(
    a,
    {
      elements = elements.updated(a, a)

      a
    }
  )

  def count: Int = elements.values.toSet.size
}
