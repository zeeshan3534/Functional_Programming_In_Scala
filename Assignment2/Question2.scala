object Main {
def main(args: Array[String]): Unit = {
//using val the map and set is mutable but using var set and map is immutable

  val map1 = Map(1 -> "kuchbhi",2 -> "kesa diya")
  // m1 += (4 -> "u") 
  println(map1)
  var map2 = Map(1 -> "kuchbhi",2 -> "kesa diya")
  map2 += (3 -> "wah")
  println(map2)

  val set1=Set(1,2,3)
  // set1+= (_5
  println(set1)
  var set2=Set(2,8,9)
  set2+=(6)
  println(set2)}}