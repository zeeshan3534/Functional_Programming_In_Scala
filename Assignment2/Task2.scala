import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

def helper(list:List[Char], s:Int, e:Int):List[Char] = {
      if(s == e) 
      list.reverse
      else helper(s.toChar :: list, s + 1, e)
    }
   def charArray(start:Int):List[Char] = {
   
    helper(List(), start, 100)
  }
  println(charArray(97))}}