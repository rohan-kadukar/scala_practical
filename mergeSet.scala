object mergeSet extends App{
  val Num1 = Set(1,2,3,4)
  val Num2 = Set(7,8,9,4)
  var Num = Num1++Num2
  println(Num)
  
  val pro=Num.product 
  println(pro)
  val s = Num.sum
  val len=Num.size
  val avg = s/len
  println(avg)
}