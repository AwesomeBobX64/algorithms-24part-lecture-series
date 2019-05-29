package algorithms.unionFind

class MapWeightedQuickUnion[T] extends UnionFind[T] {
  private var roots     = Map.empty[T, T]
  private var rootSizes = Map.empty[T, Int]

  def union(a: T, b: T): Unit = {
    if (!connected(a, b)) {
      val aRoot = findRoot(a)
      val bRoot = findRoot(b)

      val (tallRoot, shortRoot) = if (rootSizes(aRoot) >= rootSizes(bRoot)) {
        (aRoot, bRoot)
      } else {
        (bRoot, aRoot)
      }

      roots     = roots.updated(shortRoot, tallRoot)
      rootSizes = rootSizes.updated(
        tallRoot,
        rootSizes(tallRoot) + rootSizes(shortRoot)
      ) - shortRoot
    }
  }

  def connected(a: T, b: T): Boolean = findRoot(a) == findRoot(b)

  @scala.annotation.tailrec
  private def findRoot(a: T): T = {
    val aValue = find(a)

    if (aValue == a) a else findRoot(aValue)
  }

  def find(a: T): T = roots.getOrElse(
    a,
    {
      roots     = roots + (a -> a)
      rootSizes = rootSizes + (a -> 1)

      a
    }
  )

  def count: Int = roots.values.map(findRoot).toSet.size

  def getSizes: Map[T, Int] = rootSizes
}

