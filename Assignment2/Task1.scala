import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

def helper(arr:List[Int],start:Int,end:Int,size:Int):List[Int]={
    if (size==arr.length)
        arr
    else
    helper(arr :+ Random.between(start,end),start,end , size)
}
def randomNumberGenerator(start:Int,end:Int,size:Int):List[Int]={
  helper(List(),start,end,size)
}

  val list = randomNumberGenerator(50,500, 15)
  println("List of Random Number: "+ list)


 
  def putPrimesInIterator(loop:Iterable[Int],list:List[Int]):Iterable[Int] = {
    val isPrime:Int => Boolean = (num:Int) => ! ((2 until num-1) exists (num % _ == 0))
    def wrapper(loop: Iterable[Int], list: List[Int], index:Int):Iterable[Int] = {
      if(index == list.length) loop
      else wrapper(if(isPrime(list(index))) loop ++ Iterable[Int](list(index)) else iterator, list, index +1 )
    }
    wrapper(loop, list, 0)
  }

  val primes = putPrimesInIterator(Set(), list)
  println("List  " + primes)


  import scala.collection.SortedSet
  def sortSet[A](unsortedSet: Iterable[A])(implicit ordering: Ordering[A]): SortedSet[A] =
    SortedSet.empty[A] ++ unsortedSet
  println("Sorted List  " + sortSet(primes))

 
  def addToMap(map:Map[Int,Int], sortedIterable: Iterable[Int]):Map[Int,Int] = {
    def wrapper(map:Map[Int,Int], sortedIterable:Iterable[Int], index:Int):Map[Int,Int] = {
      if(index == sortedIterable.size) map
      else wrapper(map + (index -> sortedIterable.drop(index).take(1).toList.head),sortedIterable, index+1)
    }
    wrapper(map, sortedIterable, 0)
  }
  var mapp:Map[Int, Int] = Map()
  val addedMap = addToMap(mapp, sortSet(primes))
  println("Map" + addedMap)}}