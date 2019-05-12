package algorithms.unionFind

trait UnionFind[T] {
  def union(a: T, b: T): Unit

  def connected(a: T, b: T): Boolean

  def find(a: T): T

  def count: Int
}
