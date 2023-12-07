object insertionSort {
  def insertionSort(arr: Array[Int]): Array[Int] = {
    for (i <- 1 until arr.length) {
      val key = arr(i)
      var j = i - 1
      while (j >= 0 && arr(j) > key) {
        arr(j + 1) = arr(j)
        j -= 1
      }
      arr(j + 1) = key
    }
    arr
  }

  def sortMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    matrix.map(row => insertionSort(row))
  }

  def printMatrix(matrix: Array[Array[Int]]): Unit = {
    matrix.foreach(row => println(row.mkString("\t")))
  }

  def main(args: Array[String]): Unit = {
    val matrix = Array.ofDim[Int](2,2)
    matrix(0)(0)=3
    matrix(0)(1)=2
    matrix(1)(0)=1
    matrix(1)(1)=0
    

    println("Original Matrix:")
    printMatrix(matrix)

    val sortedMatrix = sortMatrix(matrix)

    println("\nSorted Matrix:")
    printMatrix(sortedMatrix)
  }
}
